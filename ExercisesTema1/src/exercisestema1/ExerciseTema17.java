package exercisestema1;

import java.util.Scanner;

public class ExerciseTema17 {

	public static void main(String[] args) {
		//Creo la variable milímetros
		double milímetros;
		
		//Creo la variable centímetros
		double centímetros;
		
		//Creo la variable metros
		double metros;
		
		//Creo la variable suma 
		double suma;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca en primer lugar la distancia en milímetros
		System.out.print("Introduce la distancia en milímetros: ");
		
		//Declaro la variable milímetros, que va a recoger la distancia introducida por el usuario
		milímetros = read.nextDouble();
		
		//Le pedimos al usuario que introduzca en primer lugar la distancia en centímetros
		System.out.print("Introduce la distancia en centímetros: ");
		
		//Declaro la variable centímetros, que va a recoger la distancia introducida por el usuario
		centímetros = read.nextDouble();
		
		//Le pedimos al usuario que introduzca en primer lugar la distancia en metros
		System.out.print("Introduce la distancia en metros: ");

		//Declaro la variable metros, que va a recoger la distancia introducida por el usuario
		metros = read.nextDouble();
		
		//Declaro la variable milímetros, indicando que su resultado será la multiplicación de la variable milímetros por 0.1. Su resultado será la conversión de milímetros a centímetros
		milímetros *= 0.1;
		
		//Declaro la variable metros, indicando que su resultado será la multiplicación de la variable metros por 100. Su resultado será la conversión de metros a centímetros
		metros *= 100;
		
		//Declaro la variable suma, que esta recogerá el resultado de las sumas de las variables milímetros, centímetros y metros
		suma = milímetros + centímetros + metros;
		
		//Le mostramos al usuario la suma de la tres distancias introducidas en centímetros. Imprimiendo por consola el resultado de la variable suma
		System.out.print("La suma de las 3 longitudes en centímetros es de: " + suma + "cm");
		
		//Cerramos el Scanner una vez que el programa haya finalizado y cumplido su función y no vaya a leer ningún dato mas del teclado
		read.close();
		
}
	
}
	
