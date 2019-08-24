package 车;

//子类  卡车
public class Teuck extends Vehicle{


    public Teuck(String no, String type, double price) {
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

