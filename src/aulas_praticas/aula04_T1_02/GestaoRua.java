package aulas_praticas.aula04_T1_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestaoRua implements Metodos {

    private Rua rua;

    public GestaoRua(Rua rua) {
        this.rua = rua;
    }

    @Override
    public void load(String filename) {

        try {
            FileReader file = new FileReader(filename);
            BufferedReader readFile = new BufferedReader(file);

            String line = readFile.readLine();
            if (line.startsWith(">")) {
                line = readFile.readLine();
            }

            while (line != null) {

                String name = line.split(" ")[1];
                int nrPortaInicial = Integer.parseInt(line.split(" ")[0].split("-")[0]);
                int nrPortaFinal = nrPortaInicial;
                if (line.split(" ")[0].split("-").length == 2) {
                    nrPortaFinal = Integer.parseInt(line.split(" ")[0].split("-")[1]);
                }

                if (nrPortaInicial > nrPortaFinal) {
                    System.err.println("Erro! Número de porta inicial maior que número de porta final no utilizador: " + line);
                    line = readFile.readLine();
                    continue;
                }

                if (!validateName(name)) {
                    System.err.println("Erro! Nome " + name + " Inválido");
                    line = readFile.readLine();
                    continue;
                }

                List<Familia> familias = rua.getFamilias();
                boolean membroExiste = false;
                for (Familia f : familias) {
                    if (membroExiste) {
                        break;
                    }
                    if (f.getNrPortaInicial() == nrPortaInicial && f.getNrPortaFinal() == nrPortaFinal) {
                        for (Pessoa p : f.getMembrosFamilia()) {

                            if (p.getNome().equals(name)) {
                                System.err.println("Membro " + line + " já existente");
                                membroExiste = true;
                                break;
                            }
                        }
                    }

                }

                if (membroExiste) {
                    line = readFile.readLine();
                    continue;
                }
                boolean membroAdd = false;
                for (Familia f : familias) {
                    if (f.getNrPortaInicial() == nrPortaInicial && f.getNrPortaFinal() == nrPortaFinal) {
                        f.addMembroFamilia(new Pessoa(name));
                        membroAdd = true;
                        break;
                    }
                }

                if (!membroAdd) {
                    rua.addFamilia(new Familia(nrPortaInicial, nrPortaFinal, name));
                }

                line = readFile.readLine();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestaoRua.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestaoRua.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public boolean validateName(String name) {

        Pattern p = Pattern.compile("[^a-z0-9_.@]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(name);
        boolean b = m.find();

        if (b) {
            return false;
        }

        if (name.matches("[^A-Za-z].*$")) {
            return false;
        }

        if (name.matches(".*[^A-Za-z0-9]$")) {
            return false;
        }

        if (name.length() > 40 || name.length() <= 0) {
            return false;
        }

        return true;
    }

    @Override
    public boolean addMembro(int x1, int x2, String name) {

        if (x1 > x2) {
            System.err.println("Erro! Número de porta inicial maior que número de porta final");
            return false;
        }

        List<Familia> familias = rua.getFamilias();
        for (Familia f : familias) {

            if (f.getNrPortaInicial() == x1 && f.getNrPortaFinal() == x2) {
                for (Pessoa p : f.getMembrosFamilia()) {

                    if (p.getNome().equals(name)) {
                        System.err.println("Membro " + name + " já existente");
                        return false;
                    }
                }
            }

        }

        for (Familia f : familias) {
            if (f.getNrPortaInicial() == x1 && f.getNrPortaFinal() == x2) {
                f.addMembroFamilia(new Pessoa(name));
                return true;
            }
        }

        rua.addFamilia(new Familia(x1, x2, name));

        return true;
    }

    @Override
    public void removeMembro(String name) {
        boolean removeName = false;
        for (Familia f : rua.getFamilias()) {
            for (Pessoa p : f.getMembrosFamilia()) {
                if (p.getNome().equals(name)) {
                    f.getMembrosFamilia().remove(p);
                    System.out.println("O membro " + name + " foi removido da familia: " + f.getNrPortaInicial() + "-" + f.getNrPortaFinal());
                    removeName = true;
                }
            }
        }
        if (!removeName) {
            System.err.println("O membro " + name + " não existe!");

        }

    }

    @Override
    public void map(Rua r) {

        Map<Integer, Set<Familia>> map = new HashMap<>();

        for (Familia f : r.getFamilias()) {
            if (map.containsKey(f.getNrPortaInicial())) {
                map.get(f.getNrPortaInicial()).add(f);
            } else {
                map.put(f.getNrPortaInicial(), new TreeSet<>());
                map.get(f.getNrPortaInicial()).add(f);
            }
        }
        int nrFamilias = r.getFamilias().size();
        String[] output = new String[r.getPortaMaxima() + 1];

        for (int i = 0; i < output.length; i++) {
            output[i] = Integer.toString(i);
        }

        while (nrFamilias > 0) {
            int aux = 1;
            while (aux < r.getPortaMaxima()) {
                Set<Familia> porFamilia = map.get(aux);
                int portaMaximaAuxiliar = 0;
                if (porFamilia != null && !porFamilia.isEmpty()) {
                    for (Familia f : porFamilia) {
                        if (f.getNrPortaFinal() > portaMaximaAuxiliar) {
                            portaMaximaAuxiliar = f.getNrPortaFinal();
                        }

                        //guardar familia
                        int tamanho = output[f.getNrPortaInicial()].length() - 1;
                        for (int i = f.getNrPortaInicial() + 1; i < f.getNrPortaFinal(); i++) {
                            if (tamanho < output[i].length() - 1) {
                                tamanho = output[i].length() - 1;
                            }
                        }
                        for (int i = f.getNrPortaInicial(); i < f.getNrPortaFinal() + 1; i++) {
                            StringBuilder strBuild = new StringBuilder();
                            strBuild.append(output[i]);
                            while (strBuild.length() - 1 < tamanho) {
                                strBuild.append(" ");
                            }
                            strBuild.append(": ").append(f.toString());
                            output[i] = strBuild.toString();
                        }

                        nrFamilias--;
                    }
                    porFamilia.clear();
                    aux = portaMaximaAuxiliar;

                }
                aux++;
            }
        }

        for (int i = 1; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }

}
