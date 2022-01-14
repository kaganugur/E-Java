import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		double i= 0,numb;
		double sum=0,count=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		numb=input.nextInt();
		for(i=0; i<numb; i++) {
			
		 if(i%3==0 && i%4==0) {
			 sum+=i;
			 
			 count++;
		 	} 
		}
		double average=sum/count;
		System.out.println("3 ve 4'e bölünebilen sayýlarýn ortalamasý: " +average);
		}
	}
