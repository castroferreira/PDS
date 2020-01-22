package aulas_praticas.aula11_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.Map;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Main {

    public static void main(String[] args) {
        Path dir = Paths.get("");
        System.out.println("Diretoria atual: " + dir.toAbsolutePath().toString());
        SimpleFileVisitor<Path> visitor = new DirVisitor();
        try {
            Files.walkFileTree(dir, visitor);
            Map<Path, Map<Path, Integer>> files = (Map<Path, Map<Path, Integer>>) ((DirVisitor) visitor).getFiles();
            printFiles(files);
            System.out.println("Tamanho total: " + ((DirVisitor) visitor).getSize() + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFiles(Map<Path, Map<Path, Integer>> files) {
        for (Path dir : files.keySet()) {
            System.out.println("Diretoria: " + dir);
            for (Map<Path, Integer> file : files.values()) {
                System.out.println("[Ficheiro: " + file.keySet() + " Tamanho: " + file.values() + " bytes]");
            }
        }
    }
}
