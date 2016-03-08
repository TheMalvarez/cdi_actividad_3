/**
 * Clase  B que se encarga de llamar a la clase A
 */
public class B implements Runnable{
    private A a;

    /**
     * Constructor que recibe un objeto de la clase A
     * @param a
     */
    public B(A a){
        this.a = a;
    }

    /**
     * Código del hilo que llama al objeto a
     */
    public void run(){
        a.EnterAndWait();
    }
}
