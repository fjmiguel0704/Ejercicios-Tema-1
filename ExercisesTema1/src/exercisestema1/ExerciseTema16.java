package exercisestema1;

import java.util.Scanner;

public class ExerciseTema16 {

	public static void main(String[] args) {
		//Creo la variable cantidad
		int cantidad;
		
		//Creo la variable segundos
		int segundos;
		
		//Creo la variable minutos
		int minutos;
		
		//Creo la variable horas
		int horas;
		
		//Creo la variable intermedio
		int intermedio;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner  (System.in);
		
		//Le pedimos al usuario que introduzca la cantidad en segundos
		System.out.print("Escribe la cantidad de segundos: ");
		
		//Declaro la variable cantidad, que esta va a recoger el dato introducido por el usuario
		cantidad = read.nextInt();
		
		//Declaro la variable segundos, que va a guardar el resto del resultado de la división de la variable cantidad entre 60
		segundos = cantidad%60;
		
		//Declaro la variable intermedio, que va a guardar el resultado de la división de cantidad entre 60
		intermedio = cantidad /60;
		
		//Declaro la variable minutos, que será el resto del resultado de la división de la variable intermedio entre 60
		minutos = intermedio %60;
		
		//Declaro la variable horas, que será el resultado de la división de la variable intermedio entre 60
		horas = intermedio/60;
		
		//Le mostramos al usuario la cantidad de sgundos convertida a horas, minutos y segundos. Imprimiendo el resultado de las variables horas, minutos y segundos
		System.out.print(cantidad + " correspondería a: " + horas + "h : " + minutos + "m : " + segundos + "s");

	}

}
