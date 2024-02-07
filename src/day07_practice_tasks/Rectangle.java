package day07_practice_tasks;

public class Rectangle {

    public double width;
    public double length;

    public void calculateArea(){
        System.out.println("The area of the rectangle is " + length * width);
    }

    public void calculatePerimeter(){
        System.out.println("The perimeter os the rectangle is " + (2*(length + width)));
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
