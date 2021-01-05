/*
* The Truck program is an extension from the Vehicle program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2021-1-5
*/

///////////////////////////////////////////////////////////////////////////////

public class Truck extends Vehicle {

  public String licenseplateNumber;
  private final int numberOfTires;
  
  /**
   * Constructor.
   */
  public Truck() {
    super();
    numberOfTires = 4;
  }

  public int getTires() {
    return numberOfTires;
  }

  public void provideAir() {
    super.accelerate();
    super.accelerate();
  }

}
