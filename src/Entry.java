import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Entry {
    private double price;   //instancevaraibler
    private int count;

    public Entry(double price, int count) {

        setPrice(price);
        setCount(count);

    }

    public double getPrice() {  // getmethod
        return price;
    }

    public void setPrice(double price) {  // set-metod

        if (price >= 0) {
            this.price = price;
        } if (price <= 0){
            System.out.println("priset kan inte vara negativt, testa skriv ett positivt pris som 10");
            throw new IllegalArgumentException("Pris kan inte vara negativit");
        }
    }

    public int getCount() {  //getmetod
        return count;
    }

    public void setCount(int count) {   // set-metod
        if (count >= 0) {
            this.count = count;
        } if (count <=0){
            System.out.println("Antal måste vara positivT, testa skriv ett positivt nummer som 2");
            throw new IllegalArgumentException("Antal måste vara positivt");
        }
    }

    public abstract void printEntry();
}