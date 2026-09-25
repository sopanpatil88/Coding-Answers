import java.util.Scanner;
public class SumOfAllMissingDigits {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 0 ; i <= 9 ; i++){
            int count = 0;
            int temp = num;

            while(temp > 0){
                int digit = temp %  10;
                if(digit == i){
                    count++;
                }
                temp /= 10;
            }

            if(count == 0){
                sum += i;
            }
        }
        System.out.println("Sum of missing digits is : " + sum);

   }
}
