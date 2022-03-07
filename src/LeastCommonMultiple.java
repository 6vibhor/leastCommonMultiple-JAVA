import java.util.Scanner;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num1 = scan.nextInt();
        System.out.println("Enter another number:");
        int num2 = scan.nextInt();
        System.out.println("The least common multiple: " + lcm(num1, num2));
    }

    public static int lcm(int num1, int num2) {
        int num3 = Math.max(num1, num2);
        if(num1 < 1 || num2 < 1) {
            return -1;
        } else {
            for(int i = num3; i > 0; i++) {
                if(i % num2 == 0 && i % num1 == 0) {
                    return i;
                }
            }
        }
        return -1;

    }
}
