public class Car {
    private String make = "PORSCHE";
    private String model = "911 GT3RS";
    private String color = "deep green";
    private int doors = 2;

    //getter
    public String getMake() {
        return make;
    }
    //getter
    public String getModel(String benzSClass) {
        return model;
    }
    //getter
    public String getColor() {
        return color;
    }
    //getter
    public int getDoors() {
        return doors;
    }
    //setter method
    public void setModel(String model) {
        this.model = model;
    }
    //setter method
    public void setColor(String color) {
        this.color = color;
    }
    //setter method
    public void setDoors(int doors) {
        this.doors = doors;
    }

    //setter method
    public void setMake(String make) {
       this.make = make;
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();

        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    //function
    public void describeCar(){
        System.out.println(make + " "+ model+" "+"color: "+ color+" "+"doors: "+doors);
    }
}
