package lesson1;

public class Person {

    private String name;
    private int power;

    public Person(String name,int power) {
        this.name = name;
      this.power = power;
    }

    public String getName() {
        return name;
    }

//    public int getCanRun() {
//        return canRun;
//    }
//    public int getCanSwim() {
//        return canSwim;
//    }
//    public int getCanJump() {
//        return canJump;
//    }
    public int getPower(){ return power;}
}
