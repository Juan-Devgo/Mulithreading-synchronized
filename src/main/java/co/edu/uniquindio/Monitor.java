package co.edu.uniquindio;

import static java.lang.Thread.sleep;

public class Monitor{

    private static int contador = 1;
    private static Hilo hilo1;
    private static Hilo hilo2;

    public Monitor(String hilo1Mensaje, String hilo2Mensaje) {

        Hilo hilo1 = new Hilo(hilo1Mensaje, this);
        Hilo hilo2 = new Hilo(hilo2Mensaje, this);

        Monitor.hilo1 = hilo1;
        Monitor.hilo2 = hilo2;
    }

    public void principal() throws InterruptedException {
        hilo1.start();
        sleep(250);
        hilo2.start();
    }

    public static int getContador() {
        return contador;
    }

    public void setContador(int i) {
        contador = i;
    }
}