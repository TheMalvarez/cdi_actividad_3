/**
 * Implementa uncontador
 * @author vmfilgueira mmalvarez2
 *
 */
public class Contador {

	private static int c = 0;
	/**
	 * Incrementa la varible c cada segundo
	 * @param n numero de incrementos de c
	 * @return retorna el valor de c
	 */
    public synchronized static int incrementar(int n){
        for (int i = 0; i < n; i++) {
			c++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Error sleep");
			}
		}
        System.out.println("Contador:" + c);
        return c;
    }

}
