//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5.9, 9.0);

        //setting the height again
        wall.setHeight(15.0);
        System.out.println("The given width: " + wall.getWidth());
        System.out.println("The given height: " + wall.getHeight());
        System.out.println("The area of the wall is " + wall.getArea());

    }
}