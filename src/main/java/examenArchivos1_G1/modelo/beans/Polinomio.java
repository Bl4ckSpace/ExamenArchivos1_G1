package examenArchivos1_G1.modelo.beans;

import java.util.ArrayList;

public class Polinomio {
    private ArrayList<Termino> terminos;

    public Polinomio(ArrayList<Termino> terminos) {
        this.terminos = terminos;
    }

    public ArrayList<Termino> getTerminos() {
        return terminos;
    }

    @Override
    public String toString() {
        StringBuilder cadenaPolinomio = new StringBuilder();
        boolean primero = true;
        for (Termino termino : this.terminos) {
            if (termino.getCoeficiente() != 0) {
                if (!primero && termino.getCoeficiente() > 0) cadenaPolinomio.append("+");
                cadenaPolinomio.append(termino);
                primero = false;
            }
        }
        return cadenaPolinomio.toString();
    }
}
