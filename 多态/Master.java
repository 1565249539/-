package 多态;

public class Master {
    private String name;
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Master(String name,int money){
        this.name=name;
        this.money=money;
    }
    public void feed(Pet pet){
        pet.eat();
    }
    public Pet adopt(int typeId){
        Pet pet=null;
        if (typeId==1){
             pet=new Dog("娜娜",77,50);
        }
        else if (typeId==2){
            pet=new Penguin("楠楠",60,40);
        }
        return pet;
    }


}
