package Exame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArmazenamentoSerial implements ArmazenamentoInterface {

    private String filename;
    private HashMap<Aluno, Integer> pauta = new HashMap<>();

    public ArmazenamentoSerial(String filename) {
        this.filename = filename;
    }

    @Override
    public void lerPauta() {
        try {
            FileInputStream fis = new FileInputStream(filename);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            String str;

            while ((str = br.readLine()) != null) {
                String[] s = str.split("\t");
                Aluno aluno = new Aluno(Integer.parseInt(s[0]), s[1]);
                int i = Integer.parseInt(s[3]);
                pauta.put(aluno, i);
            }

        } catch (FileNotFoundException ex) {
            System.err.println("O ficheiro não existe!!");
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public boolean gravarPauta(Pauta pautas) {

        try {
            FileOutputStream fos = new FileOutputStream(filename);

            for (Map.Entry<Aluno, Integer> entry : pauta.entrySet()) {
                Aluno key = entry.getKey();
                Integer value = entry.getValue();

                String s = String.format("%s\t%d\n", key.getnMec(), key.getNome(), value);
                fos.write(s.getBytes());
            }

        } catch (FileNotFoundException ex) {
            System.err.println("O ficheiro não exitse!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
