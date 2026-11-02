
package Assignment3_1;

public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            super.accelerate();
            super.accelerate();
            useGasoline(2);
        }
    }

    @Override
    public void decelerate(int amount) {
        super.decelerate(amount * 2);
    }
}

