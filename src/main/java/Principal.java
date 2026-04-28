public class Principal {
    public static void main(String[] args) {
        try {
            GestionArchivos gestionArchivos = new GestionArchivos();

            Polinomio polinomio = gestionArchivos.polinomio("polinomio.bin", "polinomio.txt");
            System.out.println(polinomio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
