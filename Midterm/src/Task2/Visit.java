package Task2;

public class Visit {
    private Customer customer;
    private String date;
    private double serviceExpence;
    private double productExpence;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpence() {
        double discountRate = 0;
        if(customer.isMember()) discountRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        return serviceExpence*(1-discountRate);
    }

    public void setServiceExpence(double expence) {
        this.serviceExpence = expence;
    }

    public double getProductExpence() {
        double discountRate = 0;
        if(customer.isMember()) discountRate = DiscountRate.getProductDiscountRate(customer.getMemberType());
        return productExpence*(1-discountRate);
    }

    public void setProductExpence(double expence) {
        this.productExpence = expence;
    }

    public double getTotalExpence() {
        return getServiceExpence() + getProductExpence();
    }

    public String toString() {
        return String.format("%sDate: %s\nService expence: %s\nProduct expence: %s\nTotal expence: %s\n",
                this.customer.toString(), this.date, this.getServiceExpence(), this.getProductExpence(), this.getTotalExpence());
    }
}
