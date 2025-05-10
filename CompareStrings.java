import java.util.Scanner;
class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int result = a.compareTo(b);
        if (result == 0) {
            System.out.println("The strings are the same.");
        } else if (result < 0) {
            System.out.println("String a is smaller than string b.");
        } else {
            System.out.println("String a is larger than string b.");
        }
        System.out.println("Compared Value: " + result);
    }
}