/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exames.EN1718;

/**
 *
 * @author andreia
 */
public class NullImo implements Imovel{

    NullImo() {
    }

    @Override
    public String toString() {
        return "ImovelVazio ["
                + "tipo=nao existe"
                + ", descricao=nao existe"
                + ", preco=" + 0.0
                + "],";
    }

    @Override
    public String type() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public double price() {
        return 0;
    }
}
