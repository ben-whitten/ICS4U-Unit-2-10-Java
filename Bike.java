/*
* The Bike program is an extension from the Vehicle program.
*
* @author  Ben Whitten
* @version 1.0
* @since   2021-1-5
*/

///////////////////////////////////////////////////////////////////////////////

public class Bike extends Vehicle {

  public int cadence;
  private final int numberOfTires;

  /**
   * Constructor.
   */
  public Bike() {
    super();
    numberOfTires = 4;
    cadence = 1;
  }

  public int getTires() {
    return numberOfTires;
  }

  public int ringBell() {
    return cadence;
  }
  
}
