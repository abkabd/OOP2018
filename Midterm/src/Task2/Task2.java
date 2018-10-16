package Task2;

public class Task2 {
    public static void main(String args[]) {
        Customer anna = new Customer("Anna");
        anna.setMember(true);
        anna.setMemberType("Gold");

        Customer roman = new Customer("Roman");

        Visit visit1 = new Visit(roman, "22.07.2018");
        visit1.setProductExpence(3000);
        visit1.setServiceExpence(1000);

        System.out.println(visit1.toString());

        Visit visit2 = new Visit(anna, "13.10.2018");
        visit2.setProductExpence(3000);
        visit2.setServiceExpence(1000);

        System.out.println(visit2.toString());
    }
}
