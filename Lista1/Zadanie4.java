import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj współczynniki równania kwadratowego (kolejno a, b i c):");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Delta ujemna, brak rozwiązań w zbiorze liczb rzeczywistych.");
            return;
        }
        double x1 = (-b-Math.sqrt(delta))/2.0/a, x2 = (-b+Math.sqrt(delta))/2.0/a;
        System.out.printf("Rozwiązania równania: x1 = %.2f, x2 = %.2f", x1, x2);
    }
}
