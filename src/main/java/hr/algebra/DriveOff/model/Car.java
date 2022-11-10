package hr.algebra.DriveOff.model;

public class Car {
    private final Integer id;
    private final String name;
    private final Double cost;
    private final CarType type;
    private final Double horsepower;
    private final DriveOffEmployee carOwner;
    private Boolean availability;


    public Car(Integer id, String name, Double cost, CarType type, Double horsepower, DriveOffEmployee carOwner) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.horsepower = horsepower;
        this.carOwner = carOwner;

        availability=false;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public CarType getType() {
        return type;
    }

    public Double getHorsepower() {
        return horsepower;
    }

    public DriveOffEmployee getCarOwner() {
        return carOwner;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public enum CarType{
        /* TODO {add car types} */
    }
}





