package exercisestema1;

import java.util.Scanner;

public class ExerciseTema13 {

	public static void main(String[] args) {
		//Creamos las variable num1 y num2 de tipo int, ya que estas van guardar números enteros
				int num1, num2;
				
				//Creamos la variable division
				int division;
				
				//Creamos la variable resto
				int resto;
				
				//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
				Scanner read = new Scanner (System.in);
				
				//Le pedimos al usuario que introduzca un número
				System.out.print("Introduce un primer número: ");
				
				//Declaramos la variable num1, que será igual al dato introducido por el usuario
				num1 = read.nextInt();
				
				//Le pedimos al usuario que introduzca un número
				System.out.print("Introduce un segundo número: ");
				
				//Declaramos la variable num2, que será igual al dato introducido por el usuario
				num2 = read.nextInt();
				
				// Declaramos la variable divsion, que guardará la división con el operador módulo del valor de la variable num1 (introducido por el usuario) entre num2 (introducido por el usuario)
				division = num1%num2;
				
				/*
				 * Declaramos la variable resto, que será el valor de num2 menos el valor de la variable division. 
				 * El cálculo de esta variable nos devolverá el resto de número que habrá que sumarle a "num1" 
				 * (dato introducido por el usuario) para que sea múltiplo de num2
				 */
				resto = num2 - division;
				
				
				
				
				//Imprimimos el resultado de la variable resto y se lo mostramos al usuario
				System.out.print("Habría que sumarle a " +num1 + ": " + resto + " números para que sea mútiplo de " +num2 );
				
				//Cerramos el Scanner una vez que el programa haya finalizado y cumplido su función y no vaya a leer ningún dato mas del teclado
				read.close();


	}

}
