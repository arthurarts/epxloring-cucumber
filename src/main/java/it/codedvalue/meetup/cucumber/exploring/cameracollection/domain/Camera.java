package it.codedvalue.meetup.cucumber.exploring.cameracollection.domain;

/**
 * @author Arthur Arts
 */
public class Camera {

    private final String brand;
    private final String model;
    private final SensorType sensorType;

    public Camera(final String brand, final String model, final SensorType sensorType) {
        this.brand = brand;
        this.model = model;
        this.sensorType = sensorType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public SensorType getSensorType() {
        return sensorType;
    }
}
