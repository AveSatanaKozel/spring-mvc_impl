package web.model;

import org.springframework.stereotype.Component;


public class Car {
    private String model;
    private int age;
    private String engineType;

    public Car() {
    }

    public Car(String model, int age, String engineType) {
        this.model = model;
        this.age = age;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
