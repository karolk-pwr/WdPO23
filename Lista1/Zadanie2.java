public class Zadanie2 {
    static double to_degrees(int st, int min, int s) {
        return st+min/60.0+s/3600.0;
    }
    public static void main(String[] args) {
        // Dane z google earth
        // Wyszehrad w Pradze: 50°03'53"N 14°25'11"E
        // Rynek główny w Krakowie: 50°03'43"N 19°56'12"E
        int promien_ziemi_km = 6371; // promień ziemi w km
        // Konwersja współrzędnych z minut i sekund na stopnie a następnie radiany
        double phi1 = Math.toRadians(to_degrees(50, 3, 53));
        double l1 = Math.toRadians(to_degrees(14, 25, 11));
        double phi2 = Math.toRadians(to_degrees(50, 3, 43));
        double l2 = Math.toRadians(to_degrees(19, 56, 12));
        double d = promien_ziemi_km * Math.acos( Math.sin(phi1) * Math.sin(phi2)
                + Math.cos(phi1) * Math.cos(phi2) * Math.cos(l1-l2) );
        System.out.printf("Odległość między Wyszehradem w Pradze a Rynkiem Głównym w Krakowie: %.2f km\n", d);
    }
}
