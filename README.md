# cdi_actividad_3

##3.1 Un simple contador concurrente
###Elabora una clase Contador que tiene un método Incrementar(n) que ejecuta un bucle de n iteraciones que incrementa una variable interna cada cierto tiempo, y al acabar devuelve el valor actual de dicha variable. Elabora un programa que lanza varios hilos que comparten tal objeto contador. Cada hilo, cada cierto tiempo, debe llamar al método Incrementar(n) con n  adecuado e visualizar el valor devuelto por ese método. ¿Podemos garantizar que cuando un hilo ejecuta el método Incrementar() , no interferirá con otro hilo? ¿Cómo podemos solucionarlo (hay varias posibilidades)? 

No.Usando Synchronized o usando un join entre los threads, en este caso no seria concurrente.
