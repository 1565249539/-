package 车;
//子类  轿车
public class Regal extends Vehicle {


    public Regal(String no, String type, double price) {
        super(no, type, price);
    }

    @Override
    public double Rent(int days) {

    return super.getPrice()*days;
    }
    public void show(){
        System.out.println("汽车牌号："+getNo()+"汽车品牌："+getType());
    }
}