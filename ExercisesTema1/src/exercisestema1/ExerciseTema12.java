package exercisestema1;

import java.util.Scanner;

public class ExerciseTema12 {

	public static void main(String[] args) {
		
		//Creamos la variable num de tipo int, ya que esta va guardar números enteros
		int num;
		
		//Creamos la variable division
		int division;
		
		//Creamos la variable resto
		int resto;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Declaramos la variable num, que será igual al dato introducido por el usuario
		num = read.nextInt();
		
		// Declaramos la variable divsion, que guardará la división con el operador módulo del valor de la variable num (introducido por el usuario) entre 7
		division = num%7;
		
		/*
		 * Declaramos la variable resto, que será 7 menos el valor de la variable division. 
		 * El cálculo de esta variable nos devolverá el resto de número que habrá que sumarle a "num" 
		 * (dato introducido por el usuario) para que sea múltiplo de 7
		 */
		resto = 7 - division;
		
		
		//Imprimimos el resultado de la variable resto y se lo mostramos al usuario
		System.out.print("Habría que sumarle a tu númro: " + resto );

	}

}
