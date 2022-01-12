package day_37_Inheritance.PhoneTask;

public class Nokia extends Phone{
    public Nokia( String model, double price, String size, String color) {
        super("Nokia", model, price, size, color);
    }

    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }
}
/*
        1.4 Create a sub class of Phone named Nokia:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    selfDefense()
                    toString()


 */