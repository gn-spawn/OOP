package ex12;

import org.apache.commons.lang3.StringUtils;

public class FreeStyle implements Decoratable{
    String str;

    FreeStyle(String str){
        this.str = str;
    }

    void printCircle(){
        System.out.println("oo" + StringUtils.repeat("o", this.str.length()) + "oo");
    };


    @Override
    public void decorate() {
        printCircle();
        System.out.println("o "+ this.str +" o");
        printCircle();
    }
}
