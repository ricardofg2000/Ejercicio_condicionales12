package unico;

import java.util.Scanner;

public class Ejercicio12{

	public static void main(String[] args) {
		/* Escribe un programa que ordene tres 
		 * números enteros introducidos por teclado.
		 */

		Scanner leer = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		int opc;
		int orden1;
		int orden2;
		int orden3;
		
		System.out.println("Este programa consiste en ordenar 3 números");
		System.out.println("¿Quiere ordenar de mayor a menor o viceversa?");
		System.out.println("1----Mayor a menor");
		System.out.println("2----Menor a mayor");
		opc = leer.nextInt();
		System.out.println("Introduzca el primer número");
		n1 = leer.nextInt();
		System.out.println("Ahora introduzca el segundo número");
		n2 = leer.nextInt();
		System.out.println("Por último el tercer número");
		n3 = leer.nextInt();
		
		if (n1 < n2) {
			if (n1 < n3) {
				orden1 = n1;
				if (n2 < n3) {
					orden2 = n2;
					orden3 = n3;
				}
				else {
					orden2 = n3;
					orden3 = n2;
				}
			}
			else {
				orden1 = n3;
				orden2 = n1;
				orden3 = n2;
			}
		}
		else {
			if (n2 < n3) {
				orden1 = n2;
				if (n1 < n3) {
					orden2 = n1;
					orden3 = n3;
				}
				else {
					orden2 = n3;
					orden3 = n1;
				}	
			}
			else {
				orden1 = n3;
				orden2 = n2;
				orden3 = n1;

			}
		}
		
		System.out.println("Los números ordenados quedan de la siguiente forma");
			
			if (opc == 1) {
				System.out.println(orden3 + " " + orden2 + " " + orden1);
			}
			else {
				System.out.println(orden1 + " " + orden2 + " " + orden3);			
			}
	}

}
