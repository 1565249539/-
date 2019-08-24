package 车;

import work.Excelle;
//人 类
public class Seller {
    private String name;
    private int days;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }




public double count(Vehicle vehicle[],int days){    //计算总数方法
        double sum=0;
        for (int i=0;i<vehicle.length;i++){
            sum+=vehicle[i].getPrice()*days;
        }
        return sum;
}
public Seller(String name,int days){
        this.name=name;
        this.days=days;

}


}
