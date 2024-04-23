import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę sekund: ");
        int input = sc.nextInt();
        int sekundy = input%60;
        int minuty = (input/60)%60;
        int godziny = input/3600;
        System.out.printf("Podany czas to: %d h %d min %d s\n", godziny, minuty, sekundy);
    }
}