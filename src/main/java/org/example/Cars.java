package org.example;

public class Cars {


    String color;

    public Cars(String color, String classicCar, String makeCar, String modelCar) {
        this.color = color;
        this.classicCar = classicCar;
        MakeCar = makeCar;
        ModelCar = modelCar;
    }

    private int ageVehicle;
    String classicCar;
    String MakeCar;
    String ModelCar;

    public Cars() {

    }


    public int getAgeVehicle() {
        return ageVehicle;
    }

    public void setAgeVehicle(int ageVehicle) {
        this.ageVehicle = ageVehicle;
    }


    public Cars(String color, String classicCar, int ageVehicle, String makeCar, String modelCar) {
        this.color = color;
        this.classicCar = classicCar;
        this.ageVehicle = ageVehicle;
        MakeCar = makeCar;
        ModelCar = modelCar;
    }

}
