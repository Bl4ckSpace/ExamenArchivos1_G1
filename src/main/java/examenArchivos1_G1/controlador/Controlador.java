package examenArchivos1_G1.controlador;


import examenArchivos1_G1.modelo.beans.Polinomio;
import examenArchivos1_G1.modelo.procesos.GestionPolinomios;

public class Controlador {
    public void ejecutar() {
        GestionPolinomios gestionPolinomios = new GestionPolinomios();
        Polinomio polinomio = gestionPolinomios.polinomio("polinomio.bin", "polinomio.txt");

        System.out.println(polinomio);
    }
}
