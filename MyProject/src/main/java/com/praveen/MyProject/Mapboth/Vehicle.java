package com.praveen.MyProject.Mapboth;

import java.util.Map;

public class Vehicle {

    private String chno;
    private String color;
    private String type;

    private Map<Bike, Price> bikePrice;

    public Vehicle() {
        super();
    }

    public Vehicle(String chno, String color, String type, Map<Bike, Price> bikePrice) {
        super();
        this.chno = chno;
        this.color = color;
        this.type = type;
        this.bikePrice = bikePrice;
    }

    @Override
    public String toString() {
        return "Vehicle [chno=" + chno + ", color=" + color + ", type=" + type + ", bikePrice=" + bikePrice + "]";
    }

    public String getChno() {
        return chno;
    }

    public void setChno(String chno) {
        this.chno = chno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<Bike, Price> getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(Map<Bike, Price> bikePrice) {
        this.bikePrice = bikePrice;
    }

    public void printDetail() {
        System.out.println("Chno :" + getChno());
        System.out.println("Color :" + getColor());
        System.out.println("Type :" + getType());

        for (Map.Entry<Bike, Price> entry : bikePrice.entrySet()) {
            Bike bike = entry.getKey();
            Price price = entry.getValue();
            System.out.println("Bike : Lisenceno - " + bike.getLisenceno() + ", Model - " + bike.getModel() +
                    " - Price: " + price.getPrice());
        }
    }
}
