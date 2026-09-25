import java.util.Scanner;
class Spy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        int addition = 0;
        int production = 1;

        while(num > 0){
            int digit = num % 10;
            addition += digit;
            production *= digit;
            num /= 10;
        }

        if(addition == production){
            System.out.println(temp + " is a SPY Number");
        }
        else{
            System.out.println(temp + " is not a SPY Number");
        }
    }
}
