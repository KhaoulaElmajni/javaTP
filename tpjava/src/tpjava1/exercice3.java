package tpjava1;

import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a , b, div;
		Scanner c = new Scanner(System.in);
		System.out.println("veuiller saisir deux nombres");
		a = c.nextDouble();
		b = c.nextDouble();
		div = a / b;
		System.out.println("la somme est "+ div);
		c.close();
	}

}
