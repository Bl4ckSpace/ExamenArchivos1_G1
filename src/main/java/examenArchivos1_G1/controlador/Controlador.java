package examenArchivos1_G1.controlador;

import examenArchivos1_G1.modelo.beans.Polinomio;
import examenArchivos1_G1.modelo.procesos.GeneracionPolinomio;

import java.util.ArrayList;

public class Controlador {
    public void ejecutar() {
        GeneracionPolinomio generacionPolinomio = new GeneracionPolinomio();

        ArrayList<Polinomio> polinomios = generacionPolinomio.leerArchivoPolinomioBin();
        generacionPolinomio.escribirArchivoPolinomioBin(polinomios);

        ArrayList<Polinomio> polinomiosBin = generacionPolinomio.leerArchivoCopiaPolinomioBin();
        generacionPolinomio.escribirArchivoTextoPlano(polinomiosBin);

        for (Polinomio polinomio : polinomiosBin) {
            System.out.println(polinomio);
        }
    }
}
