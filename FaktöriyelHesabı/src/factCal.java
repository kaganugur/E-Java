import java.util.*;
public class factCal {

	public static void main(String[] args) {
		int i,n,r,k;
		int factN=1;
		int factR=1;
		int factK=1;
		int result;
		Scanner s=new Scanner(System.in);
		
		System.out.print("n say�s�n� giriniz: ");
		n=s.nextInt();
		for(i=1; i<=n; i++) {
			factN=factN*i;
		}
		System.out.print("r say�s�n� giriniz: ");
		r=s.nextInt();
		for(i=1; i<=r; i++) {
				factR=factR*i;
		}
		for(k=1; k<=n-r; k++) {
			factK=factK*k;
		}
		result=factN/(factR*factK);
		System.out.println("Sonu�: " +result);
	}

}
