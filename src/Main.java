import java.util.Scanner;

/**
 * Created by Travis Brindley on 6/29/2017.
 */
public class Main {

    public static int getSum(int num1, int num2){
        int start;
        int end;
        int total = 0;
        if(num1 > num2){
            start = num2;
            end = num1;
        }
        else{
           start = num1;
            end = num2;
        }

        for(int i = start; i <= end; i++){
            total += i;

        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeat;
        do {
            System.out.println("Enter a number: ");
            int num1 = scan.nextInt();

            System.out.println("Enter another number: ");
            int num2 = scan.nextInt();

            int total = getSum(num1, num2);
            System.out.println(total);

            scan.nextLine();

            System.out.println("Would you like to run again? Y/N: ");
            repeat = scan.nextLine();
        }while (repeat.equalsIgnoreCase("y"));

        System.out.println("Goodbye");

    }
}
