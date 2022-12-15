package lab3_1;

public class Trip extends Journey implements CountNights{
    int countHotels;

    public Trip(String destination, int days, double price,int countHotels){
        super(destination,days,price);
        this.countHotels = countHotels;
    }

    public int getCountHotels() {
        return countHotels;
    }


    public void setCountHotels(int changeHotels) {
        this.countHotels = changeHotels;
    }

    public void fixPrice() {
        this.setPrice(this.getPrice() + this.getPrice()*1/10);
    }

    @Override
    public void countNights(int days) {
        int nights = days - 1;
        System.out.println("The nights are " + nights);
    }
}
