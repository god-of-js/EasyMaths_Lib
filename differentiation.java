// @author www.github.com/khelechy

import java.util.Scanner;
 
public class differentiation {
	
public static void main(String args[]) {

	//getting user inputs
	//@author khelechy
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Let us consider our equation is like below :" +
				"\nax^n + bx^n-1 + ...... + z");
		
		System.out.println("\nEnter n value :");
		int n = Integer.parseInt(scan.nextLine());
		int temp = n;
		float num[] = new float[n+1];
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("Enter the Co-efficient of x^" + (temp-i) + " :");
			num[i] = Float.parseFloat(scan.nextLine());
		}
		
		for(int i=0; i<n; i++) {
			
			String str = (temp-i) * num[i] + " x^" + (temp-i-1);
			System.out.println(str);
		}
	}
}