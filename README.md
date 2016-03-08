# cdi_actividad_3

## 3.1 Un simple contador concurrente
### 2. Elabora una clase Contador que tiene un método Incrementar(n) que ejecuta un bucle de n iteraciones que incrementa una variable interna cada cierto tiempo, y al acabar devuelve el valor actual de dicha variable. Elabora un programa que lanza varios hilos que comparten tal objeto contador. Cada hilo, cada cierto tiempo, debe llamar al método Incrementar(n) con n  adecuado e visualizar el valor devuelto por ese método. ¿Podemos garantizar que cuando un hilo ejecuta el método Incrementar() , no interferirá con otro hilo? ¿Cómo podemos solucionarlo (hay varias posibilidades)?

No.Usando Synchronized o usando un join entre los threads, en este caso no seria concurrente.

## 3.2 Introducción a la sincronización de hilos
#### 4. ¿Cuál es el resultado? ¿Cuántos hilos pueden estar simultáneamente ejecutando el método EnterAndWait()?
Los hilos se inician en orden pero algunos de ellos pueden no finalizar en el mismo orden en el que se inicializaron.

