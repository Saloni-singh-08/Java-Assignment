import java.util.Scanner;

class Box {
    double width, height, depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double calculateVolume() {
        return width * height * depth;
    }}
class Boxweight {
    Box box;
    double distance, costPerKM;
    public Boxweight(Box box, double distance, double costPerKM) {
        this.box = box;
        this.distance = distance;
        this.costPerKM = costPerKM;
    }
    public double calculateShippingCost() {
        double volume = box.calculateVolume();
        return distance * volume * costPerKM;
    }}
public class quest6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of the box:");
        double width = scanner.nextDouble();
        System.out.println("Enter height of the box:");
        double height = scanner.nextDouble();
        System.out.println("Enter depth of the box:");
        double depth = scanner.nextDouble();
        System.out.println("Enter distance in km:");
        double distance = scanner.nextDouble();
        System.out.println("Enter cost per km:");
        double costPerKM = scanner.nextDouble();
        Box box = new Box(width, height, depth);
        Boxweight boxWeight = new Boxweight(box, distance, costPerKM);
        double volume = box.calculateVolume();
        double shippingCost = boxWeight.calculateShippingCost();
        System.out.println("The volume of the box is: " + volume + " cubic units");
        System.out.println("The shipping cost is: " + shippingCost + " currency units");}}