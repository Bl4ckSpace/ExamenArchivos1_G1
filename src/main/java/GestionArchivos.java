import java.io.*;
import java.util.ArrayList;

public class GestionArchivos {

    public Polinomio polinomio(String nombreArchivoBin, String nombreArchivoTxt) {
        Polinomio polinomio = leerArchivoBin(nombreArchivoBin);
        escribirArchivoTxt(nombreArchivoTxt, polinomio);

        return polinomio;
    }

    private Polinomio leerArchivoBin(String nombreArchivoBin) {
        ArrayList<Monomio> polinomio = new ArrayList<>();
        boolean finArchivo = false;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivoBin))) {
            while (!finArchivo) {
                try {
                    int grado = dis.readInt();
                    int coeficiente = dis.readInt();
                    polinomio.add(new Monomio(coeficiente, grado));
                } catch (EOFException eofe) {
                    finArchivo = true;
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error de lectura.");
        }
        return new Polinomio(polinomio);
    }

    private void escribirArchivoTxt(String nombreArchivoTxt, Polinomio polinomio) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivoTxt))) {
            pw.println(polinomio);
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }
    }
}
