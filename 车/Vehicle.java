package 车;
//父类  汽车

public abstract class Vehicle {
  private String no;//车牌号
  private String type;//车类型
     private double price;//价格

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Vehicle(String no,String type,double price){
        this.no=no;
        this.type=type;
        this.price=price;
    }
    public void show(){
        System.out.println("汽车牌号："+no+"汽车品牌："+type);
    }
    public abstract double Rent(int days);


}
