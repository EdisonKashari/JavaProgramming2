package day_36_Inheritance.CryptoToken;

public class CryptoToken {
    public double price,circulatingSupply;
    public int quaintity;
    public int marketCap,volume;
    public boolean isMineable;

    public void setInfo(double price, double circulatingSupply, int quaintity, int marketCap, int volume, boolean isMineable) {
        this.price = price;
        this.circulatingSupply = circulatingSupply;
        this.quaintity = quaintity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.isMineable = isMineable;
    }

    public double totalPrice(){
        return price*quaintity;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", circulatingSupply=" + circulatingSupply +
                ", quaintity=" + quaintity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", isMineable=" + isMineable +
                ",totalPrice=" + totalPrice()+
                '}';
    }
}
