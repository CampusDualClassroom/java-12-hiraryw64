package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Citroën", "Xsara", "Diésel");

        System.out.println(myCar.isTachometerEqualToZero());
        myCar.start();
        System.out.println(myCar.tachometer);
        myCar.start();

        myCar.stop();
        System.out.println(myCar.tachometer);

        myCar.start();
        while (myCar.speedometer < 120) {
            myCar.accelerate();
        }
        myCar.accelerate();

        while (myCar.speedometer > 0) {
            myCar.brake();
        }
        myCar.brake();

        myCar.turnAngleOfWheels(20);
        myCar.turnAngleOfWheels(-100);
        myCar.turnAngleOfWheels(100);

        myCar.setReverse(true);
        myCar.setReverse(false);

        myCar.accelerate();
        myCar.setReverse(true);
    }
}