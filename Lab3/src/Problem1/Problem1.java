package Problem1;

public class Problem1 {
    public static void main(String args[]){
        Dog steve = new Dog("Steve", "meat and chicken", "black-brown", 4);
        Dog bunny = new Dog();

        System.out.print(steve.getInfo("Please, be kind with him!")+'\n');
        System.out.print(bunny.getInfo());
    }
}