package examenArchivos1_G1.modelo.procesos;

import examenArchivos1_G1.modelo.beans.Polinomio;

public class GestionPolinomios {

    public Polinomio polinomio(String nombreArchivoBin, String nombreArchivoTextoPlano) {
        GestionArchivos gestionArchivos = new GestionArchivos();

        Polinomio polinomio = gestionArchivos.leerArchivoPolinomioBin(nombreArchivoBin);
        gestionArchivos.escribirArchivoTextoPlano(polinomio, nombreArchivoTextoPlano);

        return polinomio;
    }
}
