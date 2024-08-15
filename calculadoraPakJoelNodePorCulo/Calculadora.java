package calculadoraPakJoelNodePorCulo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

		System.out.println("Pulsa 1 para sumar, 2 para restar 3 para multiplicar, 4 para dividir y 5 para la raiz cuadrada:");
		int opcion = sc.nextInt();
		
		System.out.println("Introduce un numero: ");
		int n1 = sc.nextInt();
		
		switch (opcion) {
		case 1: {
			System.out.println("Introduce otro numero: ");
			int n2 = sc.nextInt();
			System.out.println(n1 + n2);
			break;
		}
		case 2: {
			System.out.println("Introduce otro numero: ");
			int n2 = sc.nextInt();
			System.out.println(n1 - n2);	
			break;
		}
		case 3: {
			System.out.println("Introduce otro numero: ");
			int n2 = sc.nextInt();
			System.out.println(n1 * n2);	
			break;
		}
		case 4: {
			System.out.println("Introduce otro numero: ");
			int n2 = sc.nextInt();
			System.out.println(n1 / n2);
			break;
		}
		case 5: {
			double raizCuadrada = Math.sqrt(n1);
			System.out.println("La raiz cuadrada es: " + raizCuadrada);
			break;
		}
		default:
			throw new IllegalArgumentException("Introduce del 1 al 4 pedazo de subnormal");
		}
	}

}
