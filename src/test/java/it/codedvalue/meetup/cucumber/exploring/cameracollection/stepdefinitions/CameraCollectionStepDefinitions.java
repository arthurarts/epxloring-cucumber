package it.codedvalue.meetup.cucumber.exploring.cameracollection.stepdefinitions;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import it.codedvalue.meetup.cucumber.exploring.cameracollection.CameraCollection;
import it.codedvalue.meetup.cucumber.exploring.cameracollection.domain.Camera;
import it.codedvalue.meetup.cucumber.exploring.cameracollection.domain.SensorType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author Arthur Arts
 */
@Component
public class CameraCollectionStepDefinitions {

    CameraCollection cameraCollection = new CameraCollection();
    List<Camera> result = new ArrayList<>();

    @Given(".+camera from brand '(.+)' and model '(.+)' and sensortype '(.+)'")
    public void addNewCamera(final String brand, final String model, final SensorType sensorType) {
        Camera camera = new Camera(brand, model, sensorType);
        cameraCollection.addCamera(camera);
    }

    @When("^the I search for camera's with sensortype \"(.*?)\"$")
    public void setSearchParameters(SensorType sensorType) {
        result = cameraCollection.findCameraBySensorType(sensorType);
    }

    @Then("^(\\d+) camera's should have been found$")
    public void verifyAmountOfCamerasFound(final int camerasFound) {
        assertThat(result.size(), equalTo(camerasFound));
    }

}
