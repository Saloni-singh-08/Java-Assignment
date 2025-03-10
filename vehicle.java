// Create a base class Vehicle with attributes like model and year. Create a subclass Car that inherits from Vehicle and has additional attributes like numDoors and fuelType.
public class vehicle {
    String model;
    int year; 
   
public vehicle(String model,int year)
   {
   this. model = model;
   this. year = year;
   }
   public void displayvehicleInfo() {
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
 }
   
}


