/**
 * Lab 10: Car class
 * @author Victoria Seusankar
 *
 */
 
 
public class Car extends Vehicle {
	/**
	 * instance variables for the number of doors and the number of passengers
	 */
	 private int numDoors;
	 private int numPassengers;
	 
	 
	 /**
	  * constructor that receives the make, model, plate, doors, and passengers 
	  * and sets them appropriately
	  * @param make, the make of the car
	  * @param model, the model of the car
	  * @param plate, the license plate of the car
	  * @param numDoors, the number of doors on the car
	  * @param numPassengers, the number of passengers in the car
	  */
	  public Car(String make, String model, String plate, int numDoors, int numPassengers) {
	  	  super(make, model, plate);
	  	  this.numDoors = numDoors;
	  	  this.numPassengers = numPassengers;
	  }
	 
	
	/**
	 * getter for the for the number of doors
	 * @return the number of doors on the car
	 */
	 public int getDoors() {
	 	return this.numDoors;	 
	 }
	 
	 
	/**
	 * getter for the for the number of passengers
	 * @return the number of passengers in the car
	 */
	 public int getPassengers() {
	 	return this.numPassengers;	 
	 }
	 
	 
	/**
	 * toString method 
	 * @return a string of the information
	 */
	 public String toString() {
	 	 String string = String.format("%d-door %s %s with license %s.", this.numDoors, this.getMake(), this.getModel(), this.getPlate());
	 	 return string;
	 }
	
	 
	/**
	 * equals method
	 * @return true if the number of doors and passengers are equal, and the 
	 * supers are equal.
	 */
	 @Override
	 public boolean equals(Object obj) {
	 	 if(!(obj instanceof Car)) {
	 	 	 return false;
	 	 }
	 	 
	 	 Car car = (Car) obj;
	 	 
	 	 if(this.numDoors == (car.getDoors())) {
	 	 	 if(this.numPassengers == (car.getPassengers())) {
	 	 	 	 if(super.equals(obj)) {
	 	 	 	 	 return true;
	 	 	 	 }
	 	 	 }
	 	 }
	 	 return false;
	 }
	 
	 
	/**
	 * copy method 
	 * @return a copy of the Car
	 */
	 public Car copy() {
	 	 int numDoors = this.getDoors();
	 	 int numPassengers = this.getPassengers();
	 	 String make = this.getMake();
	 	 String model = this.getModel();
	 	 String plate = this.getPlate();
	 	 
	 	 Car copy = new Car(make, model, plate, numDoors, numPassengers);
	 	 return copy;
	 }
}



