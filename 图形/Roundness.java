package work02;

public class Roundness extends Graph {

    private double r;
    final public double p = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Roundness() {

    }

    public double arem() {
        return this.p * (r * r);
    }
}