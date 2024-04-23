import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        // https://pl.wikipedia.org/wiki/Rzut_ukośny_(fizyka)
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj początkowy kąt (w stopniach): ");
        double init_deg = sc.nextDouble();
        System.out.print("Podaj początkową prędkość (w m/s): ");
        double init_vel = sc.nextDouble();
        if (init_deg < 0 || init_deg > 90 || init_vel < 0) {
            System.out.println("Błędne dane! Przerywam działanie programu.");
            return;
        }
        init_deg = Math.toRadians(init_deg);  // Konwersja na radiany
        double g = 9.81;  // Przyspieszenie grawitacyjne
        double maks_wys = Math.pow(init_vel*Math.sin(init_deg), 2)/2.0/g;
        double maks_zasieg = init_vel*init_vel*Math.sin(init_deg*2)/g;
        System.out.printf("Maksymalna wysokość i zasięg dla %.2f° i %.2f m/s: %.2f m, %.2f m.",
                Math.toDegrees(init_deg), init_vel, maks_wys, maks_zasieg);
    }
}
