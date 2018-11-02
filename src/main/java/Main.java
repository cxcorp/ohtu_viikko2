import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        Multiplier kolme = new Multiplier(3);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Anna luku");
            int luku = scanner.nextInt();

            System.out.println("luku kertaa kolme on " + kolme.multipliedBy(luku));
        }
    }
}
