import java.util.Scanner;
public class main {
    static boolean isPalindrom(int number) {
        int temp = number, reversNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        int count;
      Scanner input =new Scanner(System.in);
      System.out.print("Count Enter :");
      count=input.nextInt();
      System.out.print(isPalindrom(count));
    }
}