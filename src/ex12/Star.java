package ex12;

public class Star implements Decoratable{

    String str;

    Star(String str) {
        this.str = str;
    }

    @Override
    public void decorate() {
        System.out.println("*" + this.str + "*");
    }
}
