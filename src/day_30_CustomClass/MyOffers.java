package day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("Toronto", "S4S Tech", "QA Automation", 80000, true, true, true, true);
        Offer offer2 = new Offer();
        offer2.setInfo("New Jersey", "Tesla", "QA", 120000, true, true, true, true);
        Offer offer3 = new Offer();
        offer3.setInfo("New York", "Honda", "Mechanich", 70000, false, true, false, false);
        Offer offer4 = new Offer();
        offer4.setInfo("Las Vegas", "Sony", "SDET", 150000, true, false, false   , true);
        Offer offer5 = new Offer();
        offer5.setInfo("Florida", "Target", "SM", 90000, true, false, false, true);
        Offer offer6 = new Offer();
        offer6.setInfo("Virginia", "Cydeo", "Instructor", 200000, true, true, true, true);
        Offer offer7 = new Offer();
        offer7.setInfo("New Jersey", "Macys", "Cashier", 50000, false, true, false, false);

        Offer [] myOffer ={offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>();
        fullTimeOffers.addAll(Arrays.asList(myOffer));

        fullTimeOffers.removeIf(p->p.isFullTime== false);//removes if the offer is not fulltime

        System.out.println("fullTimeOffers = " + fullTimeOffers);



        ArrayList<Offer>localOffers = new ArrayList<>();
        localOffers.addAll(Arrays.asList(myOffer));
        localOffers.removeIf(p->!p.location.equals("New Jersey"));

        System.out.println("localOffers = " + localOffers);



        ArrayList<Offer> offersWithBenefits=new ArrayList<>();
        offersWithBenefits.addAll(Arrays.asList(myOffer));

        offersWithBenefits.removeIf(p->p.hasBenefit==false );
        offersWithBenefits.removeIf(p-> p.hasPTO==false);

        System.out.println("offersWithBenefits = " + offersWithBenefits);


        ArrayList<Offer>sdetOffers=new ArrayList<>();
        sdetOffers.addAll(Arrays.asList(myOffer));
        sdetOffers.removeIf(p->!p.jobTitle.equals("SDET"));

        System.out.println("sdetOffers = " + sdetOffers);


        ArrayList<Offer> offersWith100K = new ArrayList<>();
        offersWith100K.addAll(Arrays.asList(myOffer));

        offersWith100K.removeIf(p->p.salary<100000);

        System.out.println("offersWith100K = " + offersWith100K);






    }

}
/* Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary*/