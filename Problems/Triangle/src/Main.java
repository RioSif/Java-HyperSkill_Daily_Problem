import java.util.Scanner;

class Main {
    private static Boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(isTriangle(a, b, c) ? "YES" : "NO");
    }
}
