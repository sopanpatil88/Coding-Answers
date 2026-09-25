import java.util.Scanner;
class Evil{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while(num > 0){
            int ld = num % 2;
            sum += ld;
            num /= 2;
        }

        if(sum % 2 == 0){
            System.out.println(temp + " is an Evil Number");
        }
        else{
            System.out.println(temp + " is not an Evil Number");
        }
    }
}
