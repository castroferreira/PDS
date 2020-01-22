package exames.EN1718;

import java.util.*;

/**
 *
 * @author andreia
 */
class Moradia implements Imovel {

    private String tipo, descricao, info;
    private int preco;

    private List<Imovel> imovel = new ArrayList<>();

    Moradia(String tipo, String descricao, int preco) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    Moradia(String tipo, String descricao, int preco, String info) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
        this.info = info;
    }


    @Override
    public String type() {
        return tipo;
    }

    @Override
    public String description() {
        return descricao;
    }

    @Override
    public double price() {
        return preco;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moradia[" + "tipo=" + type()
                + ", descricao=" + description()
                + ", preco=" + price()
                + "], info=" + getInfo()
        );
        for (Imovel i : imovel) {
            sb.append("\n   " + i.toString());
        }

        return sb.toString();
    }

    String addChar(String d) {
        return d=getInfo();
    }
}
