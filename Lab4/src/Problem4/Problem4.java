package Problem4;

public class Problem4 {
    public static void main(String [] args) {
        Animal a = new Animal(0, 0);
        Bird b = new Bird(0, 0, 0);

        a.moveTo(7, 5);
        b.flyTo(3,4,6);

        System.out.println("Animal\n" + a);
        System.out.println("Bird\n" + b);

    }
}
