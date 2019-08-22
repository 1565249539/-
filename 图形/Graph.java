package work02;

public abstract class Graph {
    public double high; //高
    public double broad;//宽

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getBroad() {
        return broad;
    }


    public void setBroad(double broad) {
        this.broad = broad;
    }

    public Graph() {

    }

    public Graph(double high) {
        this.high = high;
    }

    public Graph(double high, double broad) {
        this.high = high;
        this.broad = broad;
    }


    public abstract double arem();


}