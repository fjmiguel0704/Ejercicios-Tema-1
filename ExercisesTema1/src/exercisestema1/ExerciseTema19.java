package exercisestema1;

import java.util.Scanner;

public class ExerciseTema19 {

	public static void main(String[] args) {
		
		//Declaro la variable num1
		byte num1;
		
		//Declaro la variable num2
		byte num2;
		
		//Declaro la variable operador de tipo booleano para que nos devuelva un resultado de true o false
		boolean operador;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el primer número: ");
		
		//Declaro la variable num1, que guardará el dato introducido por el usuario
		num1 = read.nextByte();
		
		//Le pedimos al usuario que introduzca el primer número
		System.out.print("Introduce el segundo número: ");
		
		//Declaro la variable num2, que guardará el dato introducido por el usuario
		num2 = read.nextByte();
		
		//Declaro la variable booleana operador, indicando que me devuleva true si el dato de la variable num1 es igual a num2 y false en caso de que no sean iguales
		operador = num1 == num2 ? true : false;
		
		//Le muestre al usuario el resultado de la variable operador, que es bien true o false
		System.out.print(operador);

	}

}
