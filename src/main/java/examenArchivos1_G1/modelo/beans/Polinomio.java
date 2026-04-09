package examenArchivos1_G1.modelo.beans;

import java.util.ArrayList;

public class Polinomio {
    private ArrayList<Integer> terminos;

    public Polinomio(ArrayList<Integer> terminos) {
        this.terminos = terminos;
    }

    public ArrayList<Integer> getTerminos() {
        return terminos;
    }

    @Override
    public String toString() {
        StringBuilder linea = new StringBuilder();
        for (Integer termino : this.terminos) {
            linea.append(termino).append(" ");
        }
        return linea.toString();
    }
}
