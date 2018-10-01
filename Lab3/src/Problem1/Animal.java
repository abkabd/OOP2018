package Problem1;

public class Animal {
    private String name;
    private String food;
    private String color;
    private int age;

    public Animal() {
        this.age = 0;
        this.color = "No color";
        this.food = "No food";
        this.name = "No name";
    }

    public Animal(String name, String food, String color, int age) {
        this.name = name;
        this.food = food;
        this.color = color;
        this.age = age;
    }

    public String getInfo() {
        return String.format("Name: %s \nAge: %d \nColor: %s \nFavourite food: %s \n", name, age, color, food);
    }
}
