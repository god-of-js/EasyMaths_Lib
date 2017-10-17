//@ author www.github.com/khelechy

import java.util.Scanner;
 
public class integration {
	
	public static void main(String args[]) {

		//getting user input
		//@author khelechy
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let us consider oru equation is like below :" +
				"\nIntegration of (ax^n + bx^n-1+ .... + z)");
		
		System.out.println("\nEnter n value :");
		int n = Integer.parseInt(scan.nextLine());
		int temp = n;
		float num[] = new float[n+1];

		//@author khelechy
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("Enter the Co-efficient of x^" + (temp-i) + " :");
			num[i] = Float.parseFloat(scan.nextLine());
		}
		
		for(int i=0; i<=n; i++) {
			
			String str = (num[i] / ((temp-i)+1)) + " x^" + ((temp-i)+1) ;
			System.out.println(str);
		}
	}
}