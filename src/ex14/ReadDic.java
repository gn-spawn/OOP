package ex14;

import java.io.*;

public class ReadDic {
    public static void main(String[] args) {
        String filename = "dic.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            String[] pear;
            while ((line = reader.readLine()) != null) {
                pear = line.split(",", 0);
                int count = 0;
                System.out.println("英単語[" + pear[count] + "]は、日本語の[" + pear[count + 1] + "]という意味です");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(filename + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}