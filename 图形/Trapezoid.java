package work02;

public class Trapezoid extends Graph {
    private double s;//涓婂簳
    private double x;//涓嬪簳

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Trapezoid(double high, double s, double x) {
        super(high);
        this.s = s;
        this.x = x;

    }

    public double arem() {
        return (s + x) * high / 2;
    }
}
