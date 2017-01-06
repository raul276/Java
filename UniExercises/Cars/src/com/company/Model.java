package com.company;

/**
 * Created by Bari on 14.10.2016 г..
 */
public class Model extends Truck {
        private double serialNum;
    private String brandName;
    private boolean upgrade;

     public Model(){

     }
     public Model(double serialNum, String brandName,float load, boolean upgrade){
         this.serialNum = serialNum;
         this.brandName = brandName;
         this.upgrade = upgrade;
                 super(load);

     }

}
