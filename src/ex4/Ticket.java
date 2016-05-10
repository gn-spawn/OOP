package ex4;

public class Ticket {
    private static int count = 1;
    private int number;

    Ticket() {
        this.number = this.count;
        this.count++;

    }

    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return "Ticket(" + getNumber() + ")";
    }
}
