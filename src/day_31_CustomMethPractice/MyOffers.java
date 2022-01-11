package day_31_CustomMethPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        /*
        2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
         */

        //Offer - is a constructor
        //for it to be reusable you need to assign it to a variable
        Offer offer1 = new Offer();
        offer1.setInfo("VA","Amazon INC", "SDET", 110000, true, true, true, true);


        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony", "QA", 120000,true, false, false, true);


        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple INC", "QE", 125000, true, true, true, false);


        Offer offer4 = new Offer();
        offer4.setInfo("TX", "Capital One", "SM", 115000, false, false, true, true);


        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);


/*
        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
*/

        //are they full time? which ones?
        //first you store them to one array

        Offer [] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays.asList( myOffers )  );    //arrays.asList cause myOffers is an array only
        //ArrayList<Offer> -> Offer cause it is our variable

        fullTimeOffers.removeIf( p -> !p.isFullTime ); // removes the offer if the offer is NOT fulltime
        //p represents each of the offers we have here in this array list

        System.out.println("Full time: " + fullTimeOffers.size());
        System.out.println("Full time: " + fullTimeOffers);



        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equals("VA")); //removes what is not a local offer

        System.out.println("Local offers: " + localOffers.size());


        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " : " + localOffer.salary);
        }


    }
}
