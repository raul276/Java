package com.company;

/**
 * Created by Bari on 14.10.2016 г..
 */
public class Truck extends Vehicle { //новият клас наследява стария
    private float load;        //полетата винаги са private
    private boolean trailer;

    public Truck(){                         //два конструктура един празен и един със зададени параметри

    }

    public Truck( float load,double speed,boolean trailer){
        super(speed);        //достъпва се до vehicle class и truck наследява неговите полета
        this.load = load;
        this.trailer = trailer;
    }

    public void getLoad(float load){
        this.load = load;        //гетърите и сетърите делят памет за дадените параметри(полета)
    }
    public float getLoad(){
        return load;
    }
    public void getTrailer(boolean trailer){
        this.trailer = trailer;
    }
    public boolean setTrailer(){

        return true;
    }

    public void moveCarriage(){
        System.out.println("The truck carries "+this.load);
        if(setTrailer()==true)
            System.out.println("It carries a trailer");
        System.out.println("Speed is "+super.getSpeed());
    }


}
