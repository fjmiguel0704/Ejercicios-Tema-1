package exercisestema1;

import java.util.Scanner;

public class ExerciseTema15 {

	public static void main(String[] args) {
		
		//Creo la variable a, que recogerá un dato
		 double a;
		 
		//Creo la variable b, que recogerá un dato
		 double b;
		 
		//Creo la variable c, que recogerá un dato
		 double c;
		 
		//Creo la variable x, que recogerá un dato
		 double x;
		 
		//Creo la variable y, que será la incógnita a resolver
		 double y;
		 
		 //Creo la variable exponente, que me sustituirá a la potencia 2 para multiplicar por ella
		 double exponente;
		 
		//Le pedimos al usuario que introduzca un número
		 Scanner read = new Scanner (System.in);
		 
		//Le pedimos al usuario que introduzca un valor para a
		 System.out.print("Introduce el valor de a: ");
		 
		 //Declaramos la variable a, que esta recogerá el valor introducido por el usuario
		 a = read.nextDouble();
		 
		//Le pedimos al usuario que introduzca un valor para b
		 System.out.print("Introduce el valor de b: ");
		 
		//Declaramos la variable b, que esta recogerá el valor introducido por el usuario
		 b = read.nextDouble();
		 
		//Le pedimos al usuario que introduzca un valor para c
		 System.out.print("Introduce el valor de c: ");
		 
		//Declaramos la variable c, que esta recogerá el valor introducido por el usuario
		 c = read.nextDouble();
		 
		//Le pedimos al usuario que introduzca un valor para x
		 System.out.print("Introduce el valor de x: ");
		 
		//Declaramos la variable x, que esta recogerá el valor introducido por el usuario
		 x = read.nextDouble();
		 
		 //Declaramos la variable exponente, que esta será el resultado del valor de la variable a multiplicado por el valor de la variable x. Esto me hará de potencia 2
		 exponente = a*x;
		 
		 //Declaramos la variable y, que esta será el resultado del cálculo de los coeficientes. Esto resolverá la variable incógnita (y).
		 y = ((a*x)*exponente) + (b*x) + c;
		 
		 //Le mostramos al usuario el valor final de y
		 System.out.println("y=" + "((" + a +" x " + x  + ")"  + "²" + ")" + " + " + "(" + b + " x " + x + ")" + " + " + c);
		 System.out.print("y=" + y);

	}

}

