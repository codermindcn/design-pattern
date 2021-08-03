package me.qingy.dp.structural.composite.human_resource;

import java.util.Collections;
import java.util.List;

/**
 * 构建组织架构的代码
 *
 * @author qingy
 * @since 2021-08-03
 */
public class Demo {
    private static final long ORGANIZATION_ROOT_ID = 1001;
    private DepartmentRepo departmentRepo; // 依赖注入
    private EmployeeRepo employeeRepo; // 依赖注入

    public void buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
    }

    private void buildOrganization(Department department) {
        List<Long> subDepartmentIds = departmentRepo.getSubDepartmentIds(department.getId());
        for (Long subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            buildOrganization(subDepartment);
        }
        List<Long> employeeIds = employeeRepo.getDepartmentEmployeeIds(department.getId());
        for (Long employeeId : employeeIds) {
            double salary = employeeRepo.getEmployeeSalary(employeeId);
            department.addSubNode(new Employee(employeeId, salary));
        }
    }

    private static class DepartmentRepo {
        public List<Long> getSubDepartmentIds(long id) {
            return Collections.emptyList();
        }
    }

    private static class EmployeeRepo {
        public List<Long> getDepartmentEmployeeIds(long id) {
            return Collections.emptyList();
        }

        public double getEmployeeSalary(Long employeeId) {
            return 0;
        }
    }
}
