import java.util.Vector;

/**
 * Resuelve la actividad 3.3
 */
public class Actvidad3_3 {
    /**
     * Código princpal del programa
     * @param args Argumentos de la consola
     */
    public static void main(String[] args){
        int nHilos = 70;

        A a = new A();

        Vector<B> bs = new Vector<B>();
        Vector<Thread> threads = new Vector<Thread>();

        for(int i = 0; i < nHilos; i++){
            bs.add(new B(a));
            threads.add(new Thread(bs.get(i)));
            threads.get(i).start();
        }



    }
}
