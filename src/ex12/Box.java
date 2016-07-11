package ex12;

public class Box implements Decoratable{
    @Override
    public void decoratable() {
    }

    String str;

    Box(String str) {
        this.str = str;
    }

    void printLine(){};
}
