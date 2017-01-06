package com.company;

/**
 * Created by Bari on 14.10.2016 г..
 */
public class Vechicle {

    private double speed;
    private double accelaration;

    public Vechicle( double speed, double accelaration){
        //defaultniq konstruktor nqma parametri
        this.speed = speed;
        this.accelaration = accelaration;
    }

    public double  getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;             //използжаме this за посочvане на точната инстанция на oбекта
    }

    public double getAccelaration(){
        return accelaration;
    }
    public void setAccelaration(double accelaration){
        this.accelaration = accelaration;
    }

    public void move(){
        System.out.println("The vechicle speed is : " + speed);
    }

}
