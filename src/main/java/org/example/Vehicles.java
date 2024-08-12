package org.example;

public class Vehicles {

    public static void main(String[] args) {


        Cars c1=new Cars();
        c1.setAgeVehicle(20);
        System.out.println(c1.getAgeVehicle());
        c1.color="Yellow";
        c1.classicCar="True";
        c1.ModelCar="Honda";
        c1.MakeCar="CRV";

       System.out.println("This is the first car"+ c1.color+" "+c1.MakeCar+" "+c1.ModelCar+" "+c1.classicCar);

        Cars c2=new Cars();

        c2.classicCar="yes classic cars";
        c2.MakeCar="Toyota";
        c2.color="light Blue";
        c2.setAgeVehicle(12);

        System.out.println(c2.getAgeVehicle());

        System.out.println("This is the second car::" +c2.color+" "+c2.MakeCar+" "+c2.classicCar);

    }
}
