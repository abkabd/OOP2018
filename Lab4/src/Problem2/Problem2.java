package Problem2;


public class Problem2 {
    public static void main(String [] args) {
        Dog dog = new Dog("Labrador");
        System.out.println(dog.type + " can " + dog.getSound() + " and " + dog.getAction());
    }
}
