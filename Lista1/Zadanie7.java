import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        int nr_kubka = (int)(Math.random()*3)+1;
        System.out.printf("Bardzo tajny numer kubka: %d\n", nr_kubka);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Zgadnij numer kubka: ");
            int guess = sc.nextInt();
            if (guess == nr_kubka) {
                System.out.println("Zgadłeś!");
                break;
            } else {
                System.out.println("Źle, zgaduj dalej!");
            }
        }
    }
}
