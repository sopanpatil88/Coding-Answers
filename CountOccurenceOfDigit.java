import java.util.Scanner;

public class CountOccurenceOfDigit {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number: ");
        // int num = sc.nextInt();

        // for(int i = 0 ; i <= 9 ; i++){
        //     int temp = num;
        //     int count=0;
        //     while(temp > 0){
        //         int digit = temp% 10;
        //         if(digit == i){
        //             count++;
        //         }
        //         temp /= 10;
        //     }

        //     if(count != 0){
        //         System.out.println(i + " presents " + count + " times");
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        String input = sc.nextLine();

        for(int i = 0 ; i <= 9 ; i++){
            int count = 0;
            for(int j = 0 ; j < input.length() ; j++){
                int digit = input.charAt(j) - '0';
                if(digit == i){
                    count++;
                }
            }
            if(count == 0 && i % 2 == 0){
                System.out.println(i);
                break;
            }
        }


    }
}
