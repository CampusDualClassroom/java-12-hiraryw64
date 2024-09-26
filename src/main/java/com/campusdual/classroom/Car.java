package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void start() {
        if (isTachometerEqualToZero() == true) {
            reverse = false;
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primero ten que estar detido");
        }
    }

    public boolean isTachometerEqualToZero() {
       return tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    public void accelerate() {
        if (isTachometerEqualToZero() == true) {
            System.out.println("El coche está apagado.");
        } else {
            if (speedometer < MAX_SPEED) {
                speedometer += 10;
                System.out.println("Velocidad: " + speedometer);
            } else {
                System.out.println("Frénale, loquillo.");
            }
        }
    }

    public void brake() {
        if (isTachometerEqualToZero() == true) {
            System.out.println("El coche está apagado.");
        } else {
            if (speedometer > 0) {
                speedometer -= 10;
                System.out.println("Velocidad: " + speedometer);
            } else {
                System.out.println("No puedes ir más despacio.");
            }
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (wheelsAngle + angle > -46 && wheelsAngle + angle < 46) {
            wheelsAngle += angle;
        } else {
            System.out.println("No se puede girar más hacia este lado.");
            if (wheelsAngle + angle > 46){
                wheelsAngle = 45;
            } else {
                wheelsAngle = -45;
            }
        }
        System.out.println(showSteeringwheelDetail());
    }

    public String showSteeringwheelDetail() {
        return "Wheels angle: " + wheelsAngle;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        if (isTachometerEqualToZero() == true) {
            System.out.println("El coche está apagado.");
        } else if (speedometer != 0) {
            System.out.println("Detén el coche para cambiar el modo.");
        } else {
            this.reverse = reverse;
            showDetails();
            if (isReverse() == true) {
                gear = "R";
            } else {
                gear = "N";
            }
        }
    }

    public void showDetails() {
        if (isReverse()) {
            System.out.println("Marcha atrás activada.");
        } else {
            System.out.println("Marcha atrás desactivada.");
        }
    }
}