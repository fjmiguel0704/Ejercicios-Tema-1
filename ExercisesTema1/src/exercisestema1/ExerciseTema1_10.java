package exercisestema1;

import java.util.Scanner;

public class ExerciseTema1_10 {

	public static void main(String[] args) {
		
		//Creo la variable metros, será la variable que guardará la longitud del lanzamiento
		double metros;
		
		//Creo la varibale centDecimales, esta guardará la longitud del lanzamiento en metros convertida a centímetros
		double centDecimales;
		
		//Creo la variable centímetros, que recogerá el valor de la longitud en cenímetros pero sin decimales
		int centímetros;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca la longitud del lanzamiento en metros
		System.out.print("Introduce la cantidad en metros del lanzamiento: ");
		
		//Declaramos la variable metros, que será igual al dato introducido por el usuario
		metros = read.nextDouble();
		
		//Declaramos la variable centDecimales, que hará  de conversor, pasando de metros a centímetros. Esta recogerá el resultado de la multiplicación de la variable metros (dato introducido por el usuario) por 100
		centDecimales = metros * 100;
		
		//Declaramos la variable centímetros, que guardará el resultado de la longitud en centímetros con decimales (centDecimales) truncado a la parte entera.  
		centímetros = (int) centDecimales;
		
		//Le mostramos al usuario su longitud de lanzamiento final en el ranking. Imprimiendo la variable centímetros
		System.out.print("La longitud en centímetros de su lanzamiento en el ranking han sido: " + centímetros + "cm");
		
		//Cerramos el Scanner una vez que el programa haya finalizado y cumplido su función y no vaya a leer ningún dato mas del teclado
		read.close();
		

	}

}
