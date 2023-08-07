package Att;

import java.util.Scanner;

public class TypeTriangle {

	public static void main(String[] args) {
		
		double a, b, c;
		double aux, a2, bc;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		a = sc.nextDouble();
		System.out.println("Digite o valor de B:");
		b = sc.nextDouble();
		System.out.println("Digite o valor de C:");
		c = sc.nextDouble();
		
		if(b > a) {
			aux = a;
			a = b;
			b = aux;
		}
		if(c > a) {
			aux = a;
			a = c;
			c = aux;
		}
		
		a2 = Math.pow(a, 2);
		bc = Math.pow(b, 2) + Math.pow(c, 2);
		
		if (a >= b + c) {
			System.out.println("Não forma triangulo.");
		} else {
			
			if (a2 > bc) {
				System.out.println("Triângulo Obtusangulo.");
			}
			else if (a2 < bc){
				System.out.println("Triângulo Actuangulo.");
			}
			else {
				System.out.println("Triângulo Retangulo.");
			}
			
			if(a == b && b == c) {
				System.out.println("Triangulo Equilatero");
			}
			else if(a == b || a == c || b == c) {
				System.out.println("Triângulo Isosceles.");
			}
		}
		sc.close();
	}
	
}
