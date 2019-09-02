package Assignment_4;

public class Car {
    private String car_Owner;
    private String car_Type;
    private int speed;

    public Car(String car_Owner, String car_Type, int speed) {
        this.car_Owner = car_Owner;
        this.car_Type = car_Type;
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println("Car Owner= " + car_Owner
                + ", Car Type: " + car_Type
                + ", Speed= " + speed + " Kmph");
    }

    public String getCar_Owner() {
        return car_Owner;
    }

    public void setCar_Owner(String car_Owner) {
        this.car_Owner = car_Owner;
    }

    public String getCar_Type() {
        return car_Type;
    }

    public void setCar_Type(String car_Type) {
        this.car_Type = car_Type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
