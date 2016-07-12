package ex12;

import java.util.ArrayList;

class DecoratableList {
    public static void main(String[] args) {
        ArrayList<Decoratable> decos = new ArrayList<Decoratable>();
        decos.add(new Box("Hello World"));
        decos.add(new List("Hello World", 5));
        decos.add(new Star("Hello World"));
        decos.add(new FreeStyle("Hello World"));

        for(Decoratable obj : decos) obj.decorate();
    }
}
