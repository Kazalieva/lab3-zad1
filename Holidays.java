package lab3_1;

public class Holidays extends Journey{
    String nameHotel;

    public  Holidays(String destination, int days, double price,String nameHotel){
        super(destination,days,price);
        this.nameHotel = nameHotel;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }
    public void fixPrice() {
        this.setPrice(this.getPrice() + this.getPrice()*4/100);
    }
}
