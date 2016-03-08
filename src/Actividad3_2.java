/**
 * Resuelve la actividad 3.2
 * @author vmfilgueira mmalvarez2
 *
 */
public class Actividad3_2 implements Runnable{
	private int n;
	/**
	 * Constructor de la clase
	 * @param n numero de incrementos
	 */
	public Actividad3_2(int n){
		this.n = n;
	}
	
	
	/**
	 * La funcion main crea y inicia 3 
	 * hilos con diferentes valores de incremento
	 * @param args argumentos de la consola
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Actividad3_2(3));
		Thread t2 = new Thread(new Actividad3_2(4));
		Thread t3 = new Thread(new Actividad3_2(5));
		
		t1.start();
		t2.start();
		t3.start();
	}
	/**
	 * ejecuta el incremento indefinidamente
	 */
	@Override
	public void run() {
		int cont;
		
		while(true){
			cont = Contador.incrementar(n);
			System.out.println("Hilo: " + Thread.currentThread().getId() + " valor contador: " + cont);
			try {
				Thread.sleep((long) (Math.random()*500 + 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
