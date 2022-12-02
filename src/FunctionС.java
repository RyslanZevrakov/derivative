import java.util.Scanner;

public class FunctionС {

    Scanner scanner = new Scanner(System.in);

    public void FunctionС() {
        System.out.println("Ввидите число");
        double c = scanner.nextDouble();
        System.out.println("Ввидити степень");
        double n = scanner.nextDouble();
        double m = 0;
        double a = Math.pow(c, n);
        a = a * m;

        System.out.println(a);
        String str = "a";
        System.out.println(Character.isDigit(str.charAt(0)));
    }
}
