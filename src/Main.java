import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceți un număr: ");
        int x = in.nextInt();
        int s = sumacifrelor(x);
        System.out.println("Suma cifrelor numărului este: " + s);
    }

    public static int sumacifrelor(int x) {
        int s = 0;

        while (x != 0) {
            int digit = x % 10;
            s =s+ digit;
            x /= 10;
        }

        return s;
    }
}