package co.edu.uniquindio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Monitor m1 = new Monitor("Impares", "Pares");
        try {
            m1.principal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
