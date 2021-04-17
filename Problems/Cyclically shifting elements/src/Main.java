import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");
        String[] siftedValues = new String[values.length];

        siftedValues[0] = values[values.length - 1];
        for (int i = values.length - 1; i < 0; i--) {
            siftedValues[i] = String.valueOf(values[i - 1]);
        }

        for (String s: siftedValues) {
            System.out.print(s);
        }
    }
}