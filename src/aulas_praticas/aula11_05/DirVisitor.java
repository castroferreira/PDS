package aulas_praticas.aula11_05;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;
import java.util.TreeMap;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */

public class DirVisitor extends SimpleFileVisitor<Path> {

    private Map<Path, Map<Path, Integer>> files;
    private int size;
    private Path actualDir;

    public DirVisitor() {
        files = new TreeMap<>();
        size = 0;
        actualDir = null;
    }

    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        actualDir = dir.toAbsolutePath();
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        Map<Path, Integer> actualFile = new TreeMap<>();
        actualFile.put(file.getFileName(), (int) attrs.size());
        files.put(actualDir, actualFile);
        size += attrs.size();
        return FileVisitResult.CONTINUE;
    }

    public int getSize() {
        return size;
    }

    public Map<Path, Map<Path, Integer>> getFiles() {
        return files;
    }
}
