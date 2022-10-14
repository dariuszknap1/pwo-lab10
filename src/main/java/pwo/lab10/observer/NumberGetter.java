package pwo.lab10.observer;

import java.util.Scanner;

public class NumberGetter extends Publisher {

    Scanner scanner = new Scanner(System.in);

    public void getNumbers(int N) {
        int x;
        do {
            System.out.print("Wprowadź liczbę: ");
            try {
                x = scanner.nextInt();
            } catch (Exception ex) {
                scanner.nextLine();
                continue;
            }
            notifySubscribers(x);
            N--;
        } while (N > 0);
        scanner.close();
    }
}
