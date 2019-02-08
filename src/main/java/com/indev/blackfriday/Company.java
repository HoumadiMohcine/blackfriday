package com.indev.blackfriday;



import java.util.ArrayList;



public class Company {



    ArrayList<Machine> machines = new ArrayList() ;
    ArrayList<Capsule> capsules = new ArrayList() ;
    float fee = 0 ;

    public float sells(String capsule) {
        float salePrice = 0 ;
        for(int i=0 ; i < 5 ; i++){
            salePrice += capsules.get(i).getPrice() ;
        }
        salePrice = salePrice + (salePrice*0.2f) ;
        fee = fee + salePrice*0.2f ;
        return salePrice;

    }



    public void stock(int numberOfProducts, String type, int price) {

        for(int i = 0 ; i < numberOfProducts ; i++){

            if(type.equals("capsule")){

                Capsule product = new Capsule( price) ;

                capsules.add(product) ;

            }

            else if(type.equals("machine")){

                Machine product = new Machine( price) ;

                machines.add(product) ;

            }



        }

    }



    public Company to(int i) {

        return this;

    }



    public float computeBenefit() {

        return 0;

    }



    public int totalAssets() {

        int totalAssets = 0 ;

        for(Capsule product : capsules ){

            totalAssets += product.getPrice() ;

        }
        for(Machine product : machines ){

            totalAssets += product.getPrice() ;

        }
        return (int) ((int) totalAssets + fee);

    }



    public Company blackFriday() {

        return this;

    }

}