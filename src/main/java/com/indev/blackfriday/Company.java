package com.indev.blackfriday;

import java.util.ArrayList;

public class Company {

    ArrayList<Product> stock = new ArrayList() ;

    public float sells(String capsule) {
        return 0;
    }

    public void stock(int numberOfProducts, String type, int price) {
        for(int i = 0 ; i < numberOfProducts ; i++){
            if(type.equals("capsule")){
                Product product = new Capsule( price) ;
                stock.add(product) ;
            }
            else if(type.equals("machine")){
                Product product = new Machine( price) ;
                stock.add(product) ;
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
        for(Product product : stock ){
            totalAssets += product.getPrice() ;
        }
        return totalAssets;
    }

    public Company blackFriday() {
        return this;
    }
}
