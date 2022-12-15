package lab3_1;

public abstract class Journey {
    String destination;
    int days;
    double price;

    public Journey(String destination, int days, double price) {
        this.destination = destination;
        this.days = days;
        this.price = price;
    }

    public void setDestination(String changeDestination) {
        this.destination = changeDestination;
    }

    public void setDays(int changeDays) {
        this.days = changeDays;
    }

    public void setPrice(double changePrice) {
        this.price = changePrice;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    public double getPrice() {
        return price;
    }

    public abstract void fixPrice();

}