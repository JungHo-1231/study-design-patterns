package chapter07;

public class TurkeyAdapter implements Duck {

    Turkey turkey;


    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        System.out.println("TurkeyAdapter.quack");
    }

    @Override
    public void fly() {
        System.out.println("TurkeyAdapter.fly");
    }
}
