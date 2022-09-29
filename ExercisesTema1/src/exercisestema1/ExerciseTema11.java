package exercisestema1;

import java.util.Scanner;

public class ExerciseTema11 {

	public static void main(String[] args) {
		//Creamos la variable num de tipo double, ya que el número que se guardará en la variable va a contener decimales
		double num;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.print("Introduce un número: ");
		
		//Declaramos la variable num, que esta guardará el valor introducido por el usuario
		num = read.nextDouble();
		
		//Queremos redondear el número al entero más cercano. Para ello indicamos que la variable num va ser igual a la suma del valor de la variable num mas 0.5
		num = num+0.5;
		
		//Imprimimos por pantalla solamente la parte entera del dato con décimales de la variable num 
		System.out.print((int)num);
		
		//Cerramos el Scanner ya que el programa ha cumplido su función y no va a leer ningún dato mas del teclado
		read.close();
	}

}
