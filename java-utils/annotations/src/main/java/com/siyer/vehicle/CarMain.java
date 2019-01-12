package com.siyer.vehicle;

import com.siyer.json.JsonSerializer;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("FORD", "FI150", "2018");

        JsonSerializer serializer = new JsonSerializer();

        try {
            serializer.serialize(car);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
