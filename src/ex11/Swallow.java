package ex11;


public class Swallow extends Bird implements FlyingObject {
    @Override
    public void pick() {
        System.out.println("つつきます。");
    }

    @Override
    public void fly() {
        System.out.println("Swallowが飛びます。");
    }
}
