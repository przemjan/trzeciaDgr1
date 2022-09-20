package podstawy;

public class StringiDemo {
    public static void main(String[] args) {

        String name = "Przemek";

        int dlugosc;

        dlugosc = name.length();

        char inicjal = name.charAt(4);


        System.out.println("Długość " + dlugosc);
        System.out.println(inicjal );

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name + " " + " " + duze);

    }
}
