package project;

import java.util.Scanner;

public class DescontoNoPreco {
public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o valor");
		double pre�o = scanner.nextDouble();
		
	
		
	 double desconto = 0;
	 double resultado = 0;
	 System.out.println("digite quantos % sera o desconto");
	 desconto = scanner.nextDouble();
		
		
		
	
		
		desconto = pre�o/100*desconto;
		
	 resultado = (pre�o-desconto);
		
		
	if	( pre�o > 0) {
		
		System.out.println("o pre�o com desconto ficara "  + resultado );
		System.out.println("o desconto e de "+desconto);
	}else {System.out.println(" pre�o invalido");}
	

}
}