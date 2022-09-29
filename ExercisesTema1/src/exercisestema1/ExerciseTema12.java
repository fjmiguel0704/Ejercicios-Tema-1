package exercisestema1;

import java.util.Scanner;

public class ExerciseTema12 {

	public static void main(String[] args) {
		
		//Creamos la variable num de tipo int, ya que esta va guardar números enteros
		int num;
		
		//Creamos la variable multiplo
		int division;
		
		//Creamos la variable suma, que recogerá la cantidad que hay que sumarle a la variable num para que sea múltiplo de 7
		int suma;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Declaramos la variable num, que será igual al dato introducido por el usuario
		num = read.nextInt();
		
		division = num%7;
		
		
		
		//Imprimimos el resultado de la variable 
		System.out.print("Habría que sumarle a tu númro: " );

	}

}
