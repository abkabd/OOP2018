package Problem1;

public class Dog extends Animal {

    public Dog()
    {
        super();
    }

    public Dog(String name, String food, String color, int age) {
        super(name, food, color, age);
    }


    public String getInfo() {
        return "Animal: Dog\n" + super.getInfo();
    }

    public String getInfo(String message) {
        return this.getInfo() + String.format("Additionally: %s\n", message);
    }


}