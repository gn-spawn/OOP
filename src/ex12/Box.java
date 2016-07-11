package ex12;


import org.apache.commons.lang3.StringUtils;

public class Box implements Decoratable{
    String str;

    Box(String str) {
        this.str = str;
    }

    void printLine(){
        System.out.println("+" + StringUtils.repeat("-", this.str.length()) + "+");
    };

    @Override
    public void decorate() {
        printLine();
        System.out.println("|" + this.str + "|");
        printLine();
    }
}
