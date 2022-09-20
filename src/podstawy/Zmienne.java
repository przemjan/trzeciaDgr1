package podstawy;

public class Zmienne {
    public static void main(String[] args) {
        //numerButa mi przechowuje numer buta
        int numerButa;
        numerButa = 123;

        double liczba2;
        liczba2 = 23.9;

        numerButa = (int)liczba2;

        System.out.println("Moja numerButa wynosi " + numerButa);

        int hours = 8;
        int daysInWeek = 5;
        int weeks = 52;

        int workHours = hours * daysInWeek * weeks;

        String imie = "Franek \njest \"fajny\"";

        System.out.print("Ilość\tgodzin\\ \n \"pracy\": " + workHours + " \n");
        System.out.println(imie + ", " + workHours +" "+  weeks);

        char znak = 'g';

        boolean twierdzenie = true; //false

        //     https://github.com/przemjan/trzeciaDgr1
    }
}
