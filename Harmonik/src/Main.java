import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Say�s�n� Giriniz : ");
        int n = input.nextInt();
        double total = 0.0;
        for(double i=1; i<=n; i++){
            total += (1/i); 
        }
        System.out.print("Sonu�: " +total);
    }
}
