/**
 * Clase A que muestra mensajes por pantalla
 */
class A {
    /**
     * Muestra un mensaje por pantalla y espera un segundo
     */
    public void EnterAndWait(){
        System.out.println("Hilo:" + Thread.currentThread().getId());

        try{
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }


        System.out.println("Finalizando hilo:" + Thread.currentThread().getId());
    }
}