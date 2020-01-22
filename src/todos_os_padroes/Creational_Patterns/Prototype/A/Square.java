package Prototype_T;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw Square!!");
    }
}
