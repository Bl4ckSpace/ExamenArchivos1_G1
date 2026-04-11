package examenArchivos1_G1.modelo.procesos;

import examenArchivos1_G1.modelo.beans.Polinomio;
import examenArchivos1_G1.modelo.beans.Termino;

import java.io.*;
import java.util.ArrayList;

public class GestionArchivos {

    public Polinomio leerArchivoPolinomioBin(String nombreArchivoBin) {
        ArrayList<Termino> terminos = new ArrayList<>();
        boolean finArchivo = false;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(nombreArchivoBin))) {
            while (!finArchivo) {
                try {
                    int grado = dis.readInt();
                    int coeficiente = dis.readInt();
                    terminos.add(new Termino(grado, coeficiente));
                } catch (EOFException eofe) {
                    finArchivo = true;
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error de lectura: " + ioe.getMessage());
        }
        return new Polinomio(terminos);
    }

    public void escribirArchivoTextoPlano(Polinomio polinomio, String nombreArchivoBin) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivoBin))) {
            pw.println(polinomio);
        } catch (IOException e) {
            System.out.println("Error de escritura: "+e.getMessage());
        }
    }
}
