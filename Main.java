/*
* The Main program implements an application that
* can edit a vehicle.
*
* @author  Ben Whitten
* @version 1.1
* @since   2021-1-5
*/

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {

    // Creating Truck.
    Truck someTruck = new Truck();

    // Setting the properties.
    System.out.println("- Created Truck -");
    someTruck.licenseplateNumber = "CAJA 723";
    System.out.println("Set license plate to: "
                       + someTruck.licenseplateNumber);
    someTruck.colour = "White";
    System.out.println("Set colour to: " + someTruck.colour);
    System.out.println("Current Speed: " + someTruck.getSpeed() + "kph");
    System.out.println("Number of tires: " + someTruck.getTires());
    System.out.println("");
    
    // Creating Bike.
    Bike someBike = new Bike();
    
    // Setting the properties.
    System.out.println("- Created Bike -");
    someBike.cadence = 1;
    System.out.println("Set cadence to: " + someBike.cadence);
    someBike.colour = "Red";
    System.out.println("Set colour to: " + someBike.colour);
    System.out.println("Current Speed: " + someBike.getSpeed() + "kph");
    System.out.println("Number of tires: " + someBike.getTires());
    System.out.println("");

    someTruck.accelerate();
    System.out.println("Truck accelerated to: " + someTruck.getSpeed()
                       + "kph");
    someTruck.accelerate();
    System.out.println("Truck accelerated to: " + someTruck.getSpeed()
                       + "kph");
    someTruck.brake();
    System.out.println("Truck slowed to: " + someTruck.getSpeed()
                       + "kph");
    someTruck.provideAir();
    System.out.println("Truck added air and accelerated to: "
                       + someTruck.getSpeed() + "kph");
    System.out.println("");

    someBike.accelerate();
    System.out.println("Bike accelerated to: " + someBike.getSpeed()
                       + "kph");
    someBike.accelerate();
    System.out.println("Bike accelerated to: " + someBike.getSpeed()
                       + "kph");
    someBike.brake();
    System.out.println("Bike slowed to: " + someBike.getSpeed()
                       + "kph");
    System.out.println("Bike rang the bell at a candence of: "
                       + someBike.ringBell());

    ///////////////////////////////////////////////////////////////////////////
  }
}
