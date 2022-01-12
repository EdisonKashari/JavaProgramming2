package day_35_Encapsulation.encapsulation;

public class Candies {
private String brand;
private int quantity;
private double price;
private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            return;
        }
        this.quantity = quantity;
    }

    public String getPrice() {
        String s = Double.toString(price);
        s=(price==0)?"free":s;
        return s;
    }

    public void setPrice(double price) {
        if (price<0){
            return;
        }
        if (price==0){
            System.out.println(price+" free");
            return;
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candies(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);

    }
   /* public String costOFCandy(){
        double cost=0;
        String result ="";
        cost=quantity*price;
       result+=cost;
        if (cost==0){
            result ="free";
        }
          return result;

        }
*/



    public String toString() {
       /* String s = Double.toString(price);
        s=(price==0)?"free":s;  */

        return "Candies{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
               // ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                ", price=" + getPrice() +
                '}';
    }
}
/*Create a custom class named Candy
                private variables:
                    brand (String), quantity (int), price (double), hasPeanuts (boolean)

                Encapsulate All the private fields
                        (price of candy can not be set to negative)
                        (quantity of candy can not be set to zero or negative)

                Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

                Extra methods:
                    toString():
                        if the price is zero, print "free" instead of 0

        1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy*/

