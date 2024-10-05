package co.edu.uniquindio;

import java.util.LinkedList;

public class Hilo extends Thread {
    private String mensaje;
    private Monitor monitor;
    private LinkedList<Integer> numeros;

    public Hilo(String mensaje, Monitor monitor) {
        this.mensaje = mensaje;
        this.monitor = monitor;
        this.numeros = new LinkedList<>();
    }

    public synchronized void run() {
        for (int i = 0; i < 50; i++) {
            if(numeros.size() == 5) {
                imprimirNumeros();
                numeros.clear();
            }
            guardarNumero(monitor.getContador());
            monitor.setContador(monitor.getContador() + 1);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        imprimirNumeros();
    }

    private void guardarNumero(int numero) {
        numeros.add(numero);
    }

    private void imprimirNumeros() {
        System.out.println( mensaje + ": " + numeros.toString());
    }
}