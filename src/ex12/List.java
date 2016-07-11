package ex12;

public class List implements Decoratable{

    String str;
    int n;

    List(String str, int n) {
        this.str = str;
        this.n = n;
    }

    @Override
    public void decorate() {
        for(int i = 0; i < n; i ++) {
            System.out.println("・" + this.str + "!");
        }
    }
}
