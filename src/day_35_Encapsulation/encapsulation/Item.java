package day_35_Encapsulation.encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private double quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name.isEmpty()||name.isBlank()) {
            return;
        }
          for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= 33 && name.charAt(i) <= 64) {
                    return;
                }

                if (!(name.charAt(0)>='A' && name.charAt(0)<='Z')||( name.charAt(0)>='a'&& name.charAt(0)<='z' && name.charAt(i)!=' ' )){
                    return;
                }


       }

        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice<0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(double quantity) {
        if(quantity<0)
return;
            if (name.equalsIgnoreCase("toilet paper") ) {

                quantity = 1;


        }
        this.quantity = quantity;
    }
    public Item(String name, double unitPrice, double quantity) {
       setName(name);
       setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=$="+ calcCost()+

                '}';
    }
}
/*4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()*/