package com.rockkim;

class Car {
    private int engine;
    private String model;
    private int doors;

    public Car(int engine, String model, int doors) {
        this.engine = engine;
        this.model = model;
        this.doors = doors;
    }
    public String details() {
        return engine + " engine the model is: " + model + " it has " + doors;

    }

    public int getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }
}

class Honda extends Car {
    public Honda() {
        super(1, "Honda", 4);
    }

    @Override
    public String details() {
        return super.details();
    }

}

class Mercedes extends Car {
    public Mercedes() {
        super(1, "CLK", 2);
    }

    @Override
    public String details() {
        return super.details();
    }
}

class Bently extends Car {
    public Bently() {
        super(1, "Bently", 4);
    }

    @Override
    public String details() {
        return super.details();
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i = 0; i <= 10; i++) {
            Car car = rando();
            System.out.println(car.details());
        }
    }

    public static Car rando() {
        int randNum = (int) (Math.random() * 3) + 1;
        switch (randNum) {
            case 1:
                return new Honda();
            case 2:
                return new Mercedes();
            case 3:
                return new Bently();
        }
        return null;
    }
}
