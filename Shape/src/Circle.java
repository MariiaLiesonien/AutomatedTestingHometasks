public class Circle extends Round {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
