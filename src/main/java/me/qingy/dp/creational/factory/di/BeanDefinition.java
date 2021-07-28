package me.qingy.dp.creational.factory.di;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingy
 * @since 2021-07-28
 */
@Data
public class BeanDefinition {

    private String id;
    private String className;

    private final List<ConstructorArg> constructorArgs = new ArrayList<>();

    private Scope scope = Scope.PROTOTYPE;
    private boolean lazyInit = false;

    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void addConstructorArg(ConstructorArg constructorArg) {
        this.constructorArgs.add(constructorArg);
    }

    public enum Scope {
        SINGLETON,
        PROTOTYPE
    }

    @Data
    @Builder
    public static class ConstructorArg {
        private boolean isRef;
        private Class<?> type;
        private Object arg;
    }
}