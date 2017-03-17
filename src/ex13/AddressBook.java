package ex13;

import java.io.*;
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Address> book;
    private AddressBook(){
        book = new ArrayList<Address>();
    }

    public static void main(String[] args) { // 使ってみる
        AddressBook book = new AddressBook();
        System.out.println("ファイルから読み込む。");
        book.open("address.txt");
        System.out.println("一覧の表示。");
        book.showAddress();
        System.out.println("新規データの追加。");
        Address taroAddress = new Address("電大太郎", "東京都千代田区", "03-5280-XXXX", "taro@dendai.ac.jp");
        book.add( taroAddress );
        System.out.println("一覧の表示。");
        book.showAddress();
        System.out.println("ファイルに書き出す。");
        book.save("address2.txt");
    }

    private void save(String filename) {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            book.forEach(writer::println);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void open(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Address word = new Address(data[0],data[1],data[2],data[3]);
                book.add(word);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(filename + "が見つかりません。");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private void add(Address address) {
        book.add(address);
    }

    private void showAddress() {
        for (Address address : book) System.out.println(address.toString());
    }
}
