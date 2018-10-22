package Problem3;

import java.util.Date;

public class Problem3 {


    public static void main(String args[]) {
        Employee roma = new Employee("Roma", 18, 12015, new Date(), "17BD116721");
        Employee dima = new Employee("Dima", 16, 11500, new Date(), "19BD124532");

        System.out.println(roma.compareTo(dima));

        Manager nemo = new Manager("Nemo", 20, 10000, new Date(), "17BD172954", 1400);
        Manager m1 = nemo.clone();

        System.out.println(m1.toString());
    }
}
