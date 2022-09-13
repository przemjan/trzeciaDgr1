public class Mieszkanie {
    public static void main(String[] args) {

        int room1, room2, room3, room4;
        int length, width;

        length = 2;
        width = 3;
        room1 = length * width;

        length = 3;
        width = 4;
        room2 = length * width;

        length = 3;
        width = 4;
        room3 = length * width;

        length = 2;
        width = 2;
        room4 = length * width;

        System.out.println("powierzchnia pomieszczenia 1: " + room1);
        System.out.println("powierzchnia pomieszczenia 2: " + room2);
        System.out.println("powierzchnia pomieszczenia 3: " + room3);
        System.out.println("powierzchnia pomieszczenia 4: " + room4);

        int flatArea = room1 + room2 + room3 + room4;
        System.out.println("Powierzchnia całkowita: " + flatArea);

        int personNumber = 4;
        double areaPerPerson = (double) flatArea / personNumber;
        System.out.println("Powierzchnia na osobę: " + areaPerPerson);


    }
}
