import java.util.*;

public class usluSayi {

	public static void main(String[] args) {
		int n,k;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Üssü alýnacak sayýyý giriniz: ");
		n=scan.nextInt();
		System.out.println("Üs olacak sayýyý giriniz: ");
		k=scan.nextInt();
		int total=1;
		int i;
		for(i=1; i<=k; i++){
			total*=n;
			
		}
		System.out.println("Cevap: " +total);

	}

}
