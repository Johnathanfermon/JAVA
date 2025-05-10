import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number, result = 0, n = 0;
        while (original != 0) {
            original /= 10;
            n++;
        }
        original = number;
        while (original != 0) {
            int digit = original % 10;
            result += Math.pow(digit, n);
            original /= 10;
        }
        if (result == number) {
            System.out.println("The Number is Armstrong");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}