class Animal {
    private String type;
    private String size;
    private double weight;

    //default constructor.
    Animal(){}

    //adding constructor
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    //the toString method to print the data.


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    //method for move
    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    //function of making noise.
    public void makeNoise() {
        System.out.println(type + " makes some kind of noise.");
    }
}

