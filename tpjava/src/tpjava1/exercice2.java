package tpjava1;
import java.util.Scanner;
public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a , b, sum;
		Scanner c = new Scanner(System.in);
		System.out.println("veuiller saisir deux nombres");
		a = c.nextDouble();
		b = c.nextDouble();
		sum = a + b;
		System.out.println("la somme est "+ sum);
		c.close();
	}	

}
