package examenArchivos1_G1.modelo.beans;

public class Termino {
    private int grado;
    private int coeficiente;

    public Termino(int grado, int coeficiente) {
        this.grado = grado;
        this.coeficiente = coeficiente;
    }

    public int getGrado() {
        return grado;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    @Override
    public String toString() {
        StringBuilder cadenaPolinomio = new StringBuilder();
        if (this.grado == 0) {
            cadenaPolinomio.append(this.coeficiente);
        } else {
            if (this.coeficiente != 1 && this.coeficiente != -1) cadenaPolinomio.append(this.coeficiente);
            else if (this.coeficiente == -1) cadenaPolinomio.append("-");

            cadenaPolinomio.append("x");

            if (this.grado > 1) cadenaPolinomio.append(this.grado);
        }
        return cadenaPolinomio.toString();
    }
}