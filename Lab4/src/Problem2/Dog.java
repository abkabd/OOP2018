package Problem2;

public class Dog extends Mammal implements Actionable, Barkable{
    String type;

    public Dog(String type) {
        this.type = type;
    }


    public String type() {
        return this.type;
    }

    public String getSound() {
        return Barkable.sound;
    }

    public String getAction() {
        return Actionable.action;
    }
}
