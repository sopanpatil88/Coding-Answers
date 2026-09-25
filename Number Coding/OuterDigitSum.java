import java.util.Scanner;

public class OuterDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        int lastDigit = num % 10;
        sum += lastDigit;

        num /= 10;    //delete the last digit 

        while(num > 9){
            num /= 10;
        }

        sum += num;

        System.out.println("sum of outer digits are : " + sum);
    }
}
