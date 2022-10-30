public class Oval extends Round {
    int semiMajorAxis;
    int semiMinorAxis;

    public Oval (int semiMajorAxis, int semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public double getSquare() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

}
