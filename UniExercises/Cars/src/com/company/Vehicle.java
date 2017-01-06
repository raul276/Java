package com.company;

/**
 * Created by Bari on 14.10.2016 г..
 */
public class Vehicle {
    private double speed;

    public Vehicle(){   //празен конструктор по default се изкарва

    }
    public Vehicle(double speed){
        this.speed = speed;

    }
    public double getSpeed(){
                                    //гетърите и сетърите за пропъртита заделящи памет
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void move(){                 //полето спийд се достъпва this в рамките на класа
        System.out.println("The vehicle speed is : " + this.speed);
    }

}
