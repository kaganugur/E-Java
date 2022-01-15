import java.util.Scanner;
public class mainOdd {

	public static void main(String[] args) {
		int sayi;
		int sum=0;
		Scanner input=new Scanner(System.in);
			
		do {
			System.out.print("Bir sayý giriniz: \t");
			sayi=input.nextInt();
			if(sayi%2==0 && sayi%4==0) {
			sum=sum+sayi;
			}
			
		}while(sayi%2==0);
			System.out.println("2 ve 4 e bölünen sayýlarýn toplamý: " +sum);
			
				
	}
}