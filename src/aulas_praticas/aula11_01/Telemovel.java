package aulas_praticas.aula11_01;

import java.util.Random;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class Telemovel {

    private double processador, memoria, camera, preco;

    public Telemovel(double processador, double preco, double memoria, double camera) {
        super();
        this.processador = processador;
        this.preco = preco;
        this.memoria = memoria;
        this.camera = camera;
    }

    public double getProcessador() {
        return processador;
    }

    public double getPreco() {
        return preco;
    }

    public double getMemoria() {
        return memoria;
    }

    public double getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        return "\nProcessador: " + processador + ",\tPreco: " + preco + ",\tMemoria: " + memoria + ",\tCamera: " + camera + " mp";
    }

    public static Telemovel buildRandomNumber() {
        return new Telemovel(getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber());
    }

    public static double getRandomNumber() {
        Random r = new Random();
        return (50 + (700 - 50) * r.nextDouble());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.processador) ^ (Double.doubleToLongBits(this.processador) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.memoria) ^ (Double.doubleToLongBits(this.memoria) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.camera) ^ (Double.doubleToLongBits(this.camera) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telemovel other = (Telemovel) obj;
        if (Double.doubleToLongBits(this.processador) != Double.doubleToLongBits(other.processador)) {
            return false;
        }
        if (Double.doubleToLongBits(this.memoria) != Double.doubleToLongBits(other.memoria)) {
            return false;
        }
        if (Double.doubleToLongBits(this.camera) != Double.doubleToLongBits(other.camera)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        return true;
    }
}
