package exercisestema1;

import java.util.Scanner;

public class ExerciseTema1_4 {

	public static void main(String[] args) {
		
		//Creo la variable base, que recogerá el dato de la base del triángulo
		double base;
		
		//Creo la variable altura, que recogerá el dato de la base del triángulo
		double altura;
		
		//Creo la variable area, que calculará el area del triángulo mediante un cálculo
		double area;
		
		//Le pedimos al usuario que introduzca un número
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca la base del triángulo
		System.out.print("Introduce la base del triángulo: ");
		
		//Declaramos la variable base, indicando que esta recogerá el valor introducido por el usuario de la base del triángulo
		base = read.nextDouble();
		
		//Le pedimos al usuario que introduzca la base del triángulo
		System.out.print("Introduce la altura del triángulo: ");
		
		//Declaramos la variable altura, indicando que esta recogerá el valor introducido por el usuario de la altura del triángulo
		altura = read.nextDouble();
		
		//Declaramos la variable area, que esta será el resultado de la multiplicación del valor de la variable base por el valor de la variable altura dividido entre 2
		area = (base * altura) /2;
		
		//Le mostramos al usuario el valor de la variable area. Esto mostrará el area del triángulo ya calculada
		System.out.print("El área del triángulo es: " + area);
		
		//Cerramos el Scanner una vez que el programa haya finalizado y cumplido su función y no vaya a leer ningún dato mas del teclado
		read.close();
		
		
		

	}

}
