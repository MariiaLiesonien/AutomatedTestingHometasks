public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The area of circle is: " + circle.getSquare());

        Oval oval = new Oval(2, 1);
        System.out.println("The area of the oval is: " + oval.getSquare());

        Square square = new Square(5);
        System.out.println("The area of square is: " + square.getSquare());

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("The area of the rectangle is: " + rectangle.getSquare());
        }
    }
