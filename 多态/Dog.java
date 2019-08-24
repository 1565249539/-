package 多态;

public class Dog extends Pet {

    public Dog(String name, int health, int love) {
        super(name, health, love);
    }

    @Override
    public void eat() {
        super.setHealth(getHealth()+5);
        super.setLove(getLove()+5);
        System.out.println(super.getName()+"狗狗吃饱了！\n健康值是："+getHealth()+"\n主人请密度是:"+getLove());


    }
    public void print(){
        super.print();
    }
}
