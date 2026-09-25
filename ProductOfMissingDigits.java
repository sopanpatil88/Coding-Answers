import java.util.Scanner;

public class ProductOfMissingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int prod = 1;

        for(int i = 0 ; i <= 9 ; i++){
            int count = 0 ;
            int temp =num;

            while(temp > 0){
                int digit = temp % 10;
                if(digit == i){
                    count++;
                }
                temp /= 10;
            }

            if(count == 0){
                prod *= i;
            }
        }

        System.out.println("Product of missing digits is : " + prod);
    }
}
