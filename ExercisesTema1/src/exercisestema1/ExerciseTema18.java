package exercisestema1;

import java.util.Scanner;

public class ExerciseTema18 {

	public static void main(String[] args) {
		
		//Creo la variable constante pInfantil ya que el precio de las entradas infantiles será siempre el mismo
		final double pInfantil = 15.50;
		
		//Creo la variable constante pAdulto ya que el precio de las entradas de adultos será siempre el miso
		final int pAdulto = 20;
		
		//Creo la variable nEntradasAdultos
		int nEntradasAdultos;
		
		//Creo la variable nEntradasinfantil
		int nEntradasInfantil;
		
		//Creo la variable suma, en la que calcularé la suma de la cantidad de dinero recaudado por las entradas de adultos mas las de infantil
		double suma;
		
		//Creo la variable descuento, en la que se calculará el precio final con el descuento ya aplicado
		double descuento;
		
		//Creo la variable descuentoAplicado, en la que se indicará si se aplica el descuento o no dependiendo de las condiciones
		double descuentoAplicado;
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca cuantas entradas de adulto se han vendido
		System.out.print("¿Cuántas entradas de adultos se han vendido?: ");
		
		//Declaro la variable nEntradasAdultos, que será el dato introducido por el usuario
		nEntradasAdultos = read.nextInt();
		
		//Le pedimos al usuario que introduzca cuantas entradas infantiles se han vendido
		System.out.print("¿Cuántas entradas infantiles se han vendido?: ");
		
		//Declaro la variable nEntradasInfantil, que será el dato introducido por el usuario
		nEntradasInfantil = read.nextInt();
		
		//Multiplicamos el número de entradas de adultos (introducido por el usuario) por la variable pAdulto (20)
		nEntradasAdultos *= pAdulto;
		
		//Multiplicamos el número de entradas de infantil (introducido por el usuario) por la variable pInfantil (15.5)
		nEntradasInfantil *=pInfantil;
		
		//Declaro la variable suma, que será el resultado de la variable nEntradasAdultos mas nEntradasInfantil
		suma = nEntradasAdultos + nEntradasInfantil;
		
		//Declaro la variable decuento, que su resultado será la variable suma multiplicado por 0.95. Esto obtendrá el precio final con el descuento aplicado
		descuento = suma *0.95;
		
		//Declaro la variable descuentoAplicado, en la que indico mediante un operador ternario la siguiente condición: si la variable suma es mayor o igual a 100 devuelve el valor de la variable descuento y si no, devuelve el valor de la variable precio
		descuentoAplicado = suma >= 100 ? descuento : suma;
		
		//Le mostramos a la empresa el importe total a cobrar en taquilla según las entradas vendidas. Imprimiendo por consola la variable descuentoAplicado
		System.out.println("Se han vendido " +  suma +"€ en entradas");
		System.out.print("El importe a cobrar en taquilla es de: " + descuentoAplicado + "€");
		

	}

}
