import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszy wyraz ciągu: ");
        int a1 = sc.nextInt();
        System.out.print("Podaj iloraz ciągu: ");
        int q = sc.nextInt();
        System.out.print("Podaj liczbę elementów ciągu: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++)
            System.out.printf("%d %.2f\n", i+1, a1*Math.pow(q, i));
    }
}
