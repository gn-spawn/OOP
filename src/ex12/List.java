package ex12;

public class List implements Decoratable{
    @Override
    public void decoratable() {
    }

    String str;
    int n;

    List(String str, int n) {
        this.str = str;
        this.n = n;
    }
}
