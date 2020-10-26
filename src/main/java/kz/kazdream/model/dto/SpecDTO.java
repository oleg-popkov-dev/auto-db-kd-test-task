package kz.kazdream.model.dto;

public class SpecDTO {

    private Long id;

    private String mark;

    private String model;

    private String body;

    private Integer accelerationToHundreds;

    private Integer maxSpeed;

    private String transmission;

    private Integer numberOfGears;

    private Integer massOfCars;

    private Integer numberOfDoors;

    private Boolean cruiseControl;

    private Double fuelConsumption;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getAccelerationToHundreds() {
        return accelerationToHundreds;
    }

    public void setAccelerationToHundreds(Integer accelerationToHundreds) {
        this.accelerationToHundreds = accelerationToHundreds;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Integer getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(Integer numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public Integer getMassOfCars() {
        return massOfCars;
    }

    public void setMassOfCars(Integer massOfCars) {
        this.massOfCars = massOfCars;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Boolean getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(Boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
