public class Monomio {
    private int coeficiente;
    private int grado;

    public Monomio(int coeficiente, int grado) {
        this.coeficiente = coeficiente;
        this.grado = grado;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public int getGrado() {
        return grado;
    }

    @Override
    public String toString() {
        StringBuilder cadenaMonomio = new StringBuilder();
        int valorAbsCoeficiente = Math.abs(this.coeficiente);

        if (this.coeficiente < 0) cadenaMonomio.append("-");
        else cadenaMonomio.append("+");

        if (this.grado == 0) {
            cadenaMonomio.append(valorAbsCoeficiente);
        } else {
            if (valorAbsCoeficiente != 1) cadenaMonomio.append(valorAbsCoeficiente);
            cadenaMonomio.append("x");
            if (this.grado > 1) cadenaMonomio.append(this.grado);
        }

        return cadenaMonomio.toString();
    }
}
