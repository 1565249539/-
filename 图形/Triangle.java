package work02;

public class Triangle extends Graph {

    public Triangle(double high, double broad) {
        super(high, broad);
    }

    public double arem() {

        return super.broad * super.high;
    }


}