import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
	     
		 int number, count = 0, total=0;
	
		 Scanner input = new Scanner(System.in);
	     
		 System.out.println("Sayý giriniz: ");
		 number=input.nextInt();
		 
	        while(number != 0)
	        {
	           total=(number%10)+total;
	           number /= 10;
	            ++count;
	        }
	 
	        System.out.println("Basamak Toplamý: " + total);
	    } 	       
	 }
