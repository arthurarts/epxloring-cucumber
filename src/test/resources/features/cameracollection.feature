Feature: Camera search
  To allow me to find my favourite camera's quickly, my collection must offer multiple ways to search for a camera.

  Scenario: Search camera's by sensor type
    Given a camera from brand 'Canon' and model '5D Mark III' and sensortype 'FullFrame'
      And a camera from brand 'Canon' and model '6D' and sensortype 'FullFrame'
      And a camera from brand 'Panasonic' and model 'GM1' and sensortype 'M43'
    When the I search for camera's with sensortype "FullFrame"
    Then 2 camera's should have been found






























# to implement
#  Scenario: Search camera's by brand
#    Given a camera from brand 'Canon' and model 'Canon 5D Mark III' and sensortype 'FullFrame'
#    And another a camera from brand 'Canon' and model 'Canon 6D' and sensortype 'FullFrame'
#    And another a camera from brand 'Panasonic' and model 'GM1' and sensortype 'M43'
#    When the I search for camera's from brand "Panasonic"
#    Then 1 camera's should have been found
#    And Camera 1 should have the modelname 'GM1'
