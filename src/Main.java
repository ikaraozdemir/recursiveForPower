import javax.jws.Oneway;
import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static int pow(int base, int power) {
        int result = 1;
        if (power == 0) {
            return 1;
        }
        return result = pow(base, power - 1) * base;
    }

    public static void main(String[] args) {
        System.out.print("Taban değeri giriniz: ");
        int base = inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int power = inp.nextInt();
        System.out.println("Sonuç: " + pow(base, power));
    }
}