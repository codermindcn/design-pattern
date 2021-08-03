package me.qingy.dp.structural.composite.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 从扩展性（文件或目录可能会对应不同的操作）、业务建模（文件和目录从业务上是两个概念）、
 * 代码的可读性（文件和目录区分对待更加符合人们对业务的认知）的角度来说，最好对文件和目录进行区分设计
 *
 * @author qingy
 * @since 2021-08-03
 */
public class FileSystemNodeNORMAL {

    private String path;
    private boolean isFile;
    private List<FileSystemNodeNORMAL> subNodes = new ArrayList<>();

    public FileSystemNodeNORMAL(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNodeNORMAL fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) return 0;
            return file.length();
        }
        long sizeofFiles = 0;
        for (FileSystemNodeNORMAL fileOrDir : subNodes) {
            sizeofFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeofFiles;
    }

    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNodeNORMAL fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNodeNORMAL fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }
}
