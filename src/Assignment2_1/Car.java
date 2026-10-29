public class Car {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double targetSpeed;
    private boolean cruiseControlOn;

    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        targetSpeed = 0;
        cruiseControlOn = false;
    }

    public Car(String typeName, double gasolineLevel, double speed) {
        this.typeName = typeName;
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
        targetSpeed = 0;
        cruiseControlOn = false;
    }

    public String getTypeName() {
        return typeName;
    }

    public double getSpeed() {
        return speed;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0 && amount > 0) {
            speed = Math.max(0, speed - amount);
        } else if (gasolineLevel <= 0) {
            speed = 0;
        }
    }

    public void setTargetSpeed(double targetSpeed) {
        if (targetSpeed >= 30 && targetSpeed <= 120) {
            this.targetSpeed = targetSpeed;
        }
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (gasolineLevel <= 0 || targetSpeed < 30 || targetSpeed > 120) {
            cruiseControlOn = false;
            return false;
        }

        cruiseControlOn = true;
        speed = targetSpeed;
        return true;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }
}
