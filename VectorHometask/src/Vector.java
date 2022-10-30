import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

public class Vector {
    double x;
    double y;
    double z;

    public Vector() {
        Vector randomVector = Vector.getRandomVector();
        this.x = randomVector.x;
        this.y = randomVector.y;
        this.z = randomVector.z;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getVectorLength() {
        double a = Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2);
        double result = Math.sqrt(a);
        return result;
    }

    double getDotProduct() {
        Vector randomVector = Vector.getRandomVector();
        this.logVectorInfo(randomVector);

        return this.getDotProduct(randomVector);
    }

    double getDotProduct(Vector vector) {
        double dotProduct = this.x * vector.x + this.y * vector.y + this.z * vector.z;
        return dotProduct;
    }

    double getDotProduct(double x, double y, double z) {
        double dotProduct = this.x * x + this.y * y + this.z * z;
        return dotProduct;
    }

    private void logVectorInfo(Vector vector) {
        System.out.println("Random vector params = x: " + vector.x + ", y: " + vector.y + ", z: " + vector.z);
    }

    static ArrayList<Vector> getRandomVectors() {
        ArrayList<Vector> listOfVectors = new ArrayList<Vector>();
        for (float i = 0; i < 3; i++) {
            listOfVectors.add(new Vector(Math.random() * 10, Math.random() * 10, Math.random() * 10));
        }
        return listOfVectors;
    }

    static Vector getRandomVector(){
        int randomIndex = new Random().nextInt(3);
        Vector randomVector = Vector.getRandomVectors().get(randomIndex);
        return randomVector;
    }

    public static void main(String[] args) {
        Vector firstVec = new Vector(1, 2, 3);
        Vector secondVec = new Vector();
        System.out.println("The length of the 3d vector is: " + firstVec.getVectorLength());
        System.out.println("The dot product is: " + firstVec.getDotProduct(2, 3, 1));
        System.out.println("The second dot product is: " + secondVec.getDotProduct());
    }
}