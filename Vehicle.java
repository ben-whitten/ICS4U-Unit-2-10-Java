/*
* The Vehicle program implements an application that
* creates a vehicle.
*
* @author  Ben Whitten
* @version 1.1
* @since   2021-1-5
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

abstract class Vehicle {

  // variables for later.
  public String colour;
  private int speed = 40;
  private final int maximumSpeed = 100;
  private final int speedIncreaseDecrease = 10;

  /////////////////////////////////////////////////////////////////////////////

  public int getSpeed() {

    return speed;
  }

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Accelerate function.
   */
  public void accelerate() {
   
    speed += speedIncreaseDecrease;

    if (speed > maximumSpeed) {
      speed = maximumSpeed;
    }
  }

  /////////////////////////////////////////////////////////////////////////////
  /**
   * Brake function.
   */
  public void brake() {

    speed -= speedIncreaseDecrease;

    if (speed < 0) {
      speed = 0;
    }
  }
}
