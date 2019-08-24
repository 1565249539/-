package 多态;

public class Penguin extends Pet {
    public Penguin(String name, int health, int love) {
        super(name, health, love);
    }

    @Override
    public void eat() {
        super.setHealth(getHealth()+3);
        super.setLove(getLove()+3);
        System.out.println(super.getName()+"吃饱了！\n健康值是："+getHealth()+"\n和主人请密度是："+getLove());

    }
    public void print(){
        super.print();
    }
}
