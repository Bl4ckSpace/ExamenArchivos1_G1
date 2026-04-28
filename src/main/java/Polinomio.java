import java.util.ArrayList;

public class Polinomio {
    private ArrayList<Monomio> polinomio;

    public Polinomio(ArrayList<Monomio> polinomio) {
        this.polinomio = polinomio;
    }

    public ArrayList<Monomio> getPolinomio() {
        return polinomio;
    }

    @Override
    public String toString() {
        if (this.polinomio.isEmpty()) return "0";

        StringBuilder cadenaPolinomio = new StringBuilder();

        for (Monomio monomio : this.polinomio) {
            cadenaPolinomio.append(monomio);
        }

        if (cadenaPolinomio.charAt(0) == '+') {
            cadenaPolinomio.deleteCharAt(0);
        }

        return cadenaPolinomio.toString();
    }
}
