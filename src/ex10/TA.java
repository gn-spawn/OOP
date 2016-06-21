package ex10;

public class TA extends Student{
    private String subject;
    private String extension;

    TA(String studentNumber, String name, String address, String tel, String subject, String extension) {
        super(studentNumber, name, address, tel);
        this.subject = subject;
        this.extension = extension;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "a TA(" + getStudentNumber() + "," + getName() + "," + getAddress() + "," + getTel() + "," + getSubject() + "," + getExtension() + ")" ;
    }

    public static void main(String[] args) {
        TA ta = new TA("15fi039", "Kaito Kaneko", "Tokyo", "000000000000", "Test", "1111");
        ta.setSubject("BBBB");
        ta.setExtension("2222");
        System.out.println(ta.getSubject());
        System.out.println(ta.getExtension());
        System.out.println(ta.toString());
    }
}
