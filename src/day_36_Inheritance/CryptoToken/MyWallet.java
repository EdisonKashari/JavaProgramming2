package day_36_Inheritance.CryptoToken;

public class MyWallet {
    public static void main(String[] args) {


        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(35.4,5.8,58,87,14,true);
        bitcoin.totalPrice();
        System.out.println(bitcoin);
        Etherem etherem = new Etherem();
        etherem.setInfo(45.4,87.4,47,87,54,false);
        etherem.totalPrice();
        System.out.println(etherem);
        Cardano cardano = new Cardano();
        cardano.setInfo(47.4,78,787,5,8,true);
        cardano.totalPrice();
        System.out.println(cardano);

        XRP xrp = new XRP();
        xrp.setInfo(45,7,8,78,7,false);
        xrp.totalPrice();
        System.out.println(xrp);

        Doge doge = new Doge();
        doge.setInfo(45,87,8,8,8,false);
        doge.totalPrice();
        System.out.println(doge);


    }
}