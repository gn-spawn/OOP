package ex4;

public class Card {
    private int mark;
    private int number;

    public static final int SPADE = 0;
    public static final int HEART = 1;
    public static final int CLUB = 2;
    public static final int DIAMOND = 3;

    public Card(int m, int num) {
        this.mark = m;
        this.number = num;
    }

    public int getMark() {
        return this.mark;
    }
    public int getNumber() {
        return  this.number;
    }

    public String color() {
        String instanceColor = "";
        switch (this.mark) {
            case DIAMOND:
                instanceColor = "赤";
                break;

            case SPADE:
                instanceColor = "黒";
                break;

            case HEART:
                instanceColor = "赤";
                break;

            case CLUB:
                instanceColor = "黒";
                break;
        }
        return instanceColor;
    }
    public String toString() {
        String stringMark = "";
        String stringNumber = "";
        String paragraph = "";
        switch (this.getMark()) {
            case SPADE:
                stringMark = "S";
                break;

            case HEART:
                stringMark = "H";
                break;

            case CLUB:
                stringMark = "C";
                break;

            case DIAMOND:
                stringMark = "D";
                break;
        }

        switch (this.getNumber()) {
            case 1:
                stringNumber = "A";
                break;

            case 11:
                stringNumber = "J";
                break;

            case 12:
                stringNumber = "Q";
                break;

            case 13:
                stringMark = "K";
                break;
            default:
            if (stringMark == "A" || stringMark == "J" || stringMark == "Q" || stringMark == "K") {
                paragraph = "a Card(" + stringMark + "," + stringNumber + ")";
            }else {
                paragraph = "a Card(" + stringMark + "," + this.getNumber() + ")";
            }
        }

    return paragraph;
    }

    public boolean isEqualMark(Card aCard) {
        if (this.getMark() == aCard.getMark()) {
            return true;
        } else {
            return  false;
        }
    }

    public boolean isLargerThan(Card aCard) {
        if (this.getNumber() == 1 && aCard.getNumber() == 13) {
            return true;
        } else if (this.getNumber() == 13 && aCard.getNumber() == 1) {
            return false;
        } else {
            if (this.getNumber() > aCard.getNumber()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Card card1, card2, card3;
        card1 = new Card(Card.SPADE, 1);
        card2 = new Card(Card.DIAMOND, 2);
        card3 = new Card(Card.SPADE, 13);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card1.toString());
        System.out.println(card1.isLargerThan(card3));
        System.out.println(card1.color());
    }


}