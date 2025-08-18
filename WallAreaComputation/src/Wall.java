public class Wall {
    private double width;
    private double height;

    //first empty constructor
    public Wall(){};

    //second constructor to set the values of the fields

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }
    //getters and setters
    public double getWidth(){
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(double width){
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height){
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }

    //for the area
    public double getArea(){
        return width * height;
    }
}
