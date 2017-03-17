package ex13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.PrivateKey;

public class Address {
    String name;
    String address;
    String tel;
    String email;

    Address(String name, String address, String tel, String email){
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.name + "," + this.address + "," + this.tel + "," + this.email;
    }

}
