package com.company;

/**
 * Created by Bari on 11.11.2016 г..
 */
public class Phone {
        private String manufacturer;
    private String model;
    private int year;
    private int batteryCapacity;

    public Phone(String manufacturer, String model, int year, int batteryCapacity) {
        this.setManufacturer(manufacturer);
        this.setModel(model);
        this.setYear(year);
        this.setBatteryCapacity(batteryCapacity);
    }



    private void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    private String getManufacturer() {

        return manufacturer;
    }

    private String getModel() {
        return model;
    }

    private int getYear() {
        return year;
    }

    private int getBatteryCapacity() {
        return batteryCapacity;
    }
}
