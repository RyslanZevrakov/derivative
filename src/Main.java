import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws java.io.IOException{
        char choice;
        FunctionX functionX = new FunctionX();
        do {
            System.out.println("что-то");
            System.out.println("1. FunctionС");
            System.out.println("2. FunctionX");
            System.out.println();
            choice = (char) System.in.read();
        }
        while (choice< '1' || choice > '4' );
        System.out.println("\n");
        switch (choice) {
            case '1':
            functionX.FunctionС();

            break;
            case '2':
                functionX.FunctionX();
                break;
        }
    }
}