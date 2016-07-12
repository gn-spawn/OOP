package ex12;

public class DecoratableSample {
    public static void main(String[] args) {
        Decoratable star, box, list, freestyle;
        star = new Star("Hello Tokyo");
        box = new Box("Hello Japan");
        list = new List("Hello Universe", 3);
        freestyle = new FreeStyle("HelloWorld");
        star.decorate();
        box.decorate();
        list.decorate();
        freestyle.decorate();
    }
}
