package it.codedvalue.meetup.cucumber.exploring.cameracollection;

import it.codedvalue.meetup.cucumber.exploring.cameracollection.domain.Camera;
import it.codedvalue.meetup.cucumber.exploring.cameracollection.domain.SensorType;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arthur Arts
 */
public class CameraCollection {


    private final List<Camera> cameracollection = new ArrayList<>();

    public void addCamera(final Camera camera) {
        cameracollection.add(camera);
    }

    public List<Camera> findCameraByBrand(final String brand) {
        return cameracollection.stream().filter(camera -> camera.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public List<Camera> findCameraBySensorType(final SensorType sensorType) {
        return cameracollection.stream().filter(camera -> camera.getSensorType().equals(sensorType)).collect(Collectors.toList());
    }

}
