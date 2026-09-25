import java.util.Scanner;

public class XylemOrPholeum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int outerSum = 0;
        int innerSum = 0;

        int ld = num % 10;

        outerSum += ld;
        num /= 10;

        while(num > 9){
            ld = num % 10;
            innerSum += ld;
            num /= 10;
        }
        outerSum += num;

        if(innerSum == outerSum){
            System.out.println("Xylem");
        }
        else{
            System.out.println("Pholeum");
        }

    }
}
