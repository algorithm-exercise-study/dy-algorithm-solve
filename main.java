package algorithm;

import java.util.Scanner;

public class main {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        n = 1000-n;
	        int count=0;
	        
		        count += n / 500;
		        n = n % 500;
		        
		        count += n / 100;
		        n = n % 100;

		        count += n / 50;
		        n = n % 50;
		        
		        count += n/10;
		        n = n % 10;

		        count += n / 5;
		        n = n % 5;

		        count += n/1;
		        n = n % 1;
		        
		        System.out.println(count);
		        
	   }
}
