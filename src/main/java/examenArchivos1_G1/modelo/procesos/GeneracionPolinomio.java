package examenArchivos1_G1.modelo.procesos;

import examenArchivos1_G1.modelo.beans.Polinomio;

import java.io.*;
import java.util.ArrayList;

public class GeneracionPolinomio {

    public ArrayList<Polinomio> leerArchivoPolinomioBin() {
        String linea;
        ArrayList<Polinomio> polinomios = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream("polinomio.bin"))) {
            while ((linea = dis.readLine()) != null) {
                ArrayList<Integer> numeros = new ArrayList<>();
                String[] partes = linea.split(" ");
                for (int i = 2; i<partes.length; i++) {
                    numeros.add(Integer.parseInt(partes[i]));
                }
                if (partes.length > 0) {
                    polinomios.add(new Polinomio(numeros));
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: "+e.getMessage());
        }
        return polinomios;
    }

    public void escribirArchivoPolinomioBin(ArrayList<Polinomio> polinomios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("copiaPolinomio.bin"))) {
            for (Polinomio polinomio : polinomios) {
                oos.writeObject(polinomio);
            }
        } catch (IOException e) {
            System.out.println("Error de escritura: "+e.getMessage());
        }
    }

    public ArrayList<Polinomio> leerArchivoCopiaPolinomioBin() {
        String linea;
        ArrayList<Polinomio> polinomios = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream("copiaPolinomio.bin"))) {
            while ((linea = dis.readLine()) != null) {
                ArrayList<Integer> numeros = new ArrayList<>();
                String[] partes = linea.split(" ");
                for (int i = 2; i<partes.length; i++) {
                    numeros.add(Integer.parseInt(partes[i]));
                }
                if (partes.length > 0) {
                    polinomios.add(new Polinomio(numeros));
                }
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: "+e.getMessage());
        }
        return polinomios;
    }

    public void escribirArchivoTextoPlano(ArrayList<Polinomio> polinomios) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("polinomio.txt"))) {
            for (Polinomio polinomio : polinomios) {
                pw.println(polinomio);
            }
        } catch (IOException e) {
            System.out.println("Error de escritura: "+e.getMessage());
        }
    }
}
