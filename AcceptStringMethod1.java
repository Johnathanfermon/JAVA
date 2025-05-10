import java.util.Scanner;
class AcceptStringMethod1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(id + " The number of the student");
        System.out.println(name + " The Name of the student");
    }
}