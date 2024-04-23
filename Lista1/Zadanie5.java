import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj podstawę opodatkowania: ");
        int podstawa = sc.nextInt();
        double podatek = podstawa <= 120_000 ? podstawa*0.12 : 10_800 + 0.32*(podstawa-120_000);
        System.out.printf("Uzyskana kwota podatku: %.2f PLN\n", podatek);
    }
}
