import java.util.Scanner;
public class SumOf1sInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        int sum = 0;


        while(num > 0){
            int ld = num % 2;
            sum += ld;
            num /= 2;
        }

        System.out.println(sum);
    }
}