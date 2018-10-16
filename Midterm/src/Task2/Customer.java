package Task2;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
        this.member = false;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString() {
        return String.format("Name: %s\nMember type: %s\n", name, (member ? memberType : "Not a member"));
    }
}
