import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		int n;
		 Scanner s=new Scanner(System.in);
		 
		 System.out.println("Sýnýr sayýsýný giriniz: ");
		 n=s.nextInt();
		 
		 for(int i = 1; i<=n; i*=4) {
			 System.out.println(i);
			
		 }  System.out.println("\n");
		 for(int i = 1; i<=n; i*=5) {
			 System.out.println(i);
		 } 
	}

}