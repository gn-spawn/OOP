package ex10;

public class Student {
    private String studentNumber;
    private String name;
    private String address;
    private String tel;

    public static void main(String[] args) {
        Student student1 = new Student("15fi039", "Kaito Kaneko", "Tokyo", "0000000");
        student1.setName("Test");
        student1.setAddress("Test");
        student1.setTel("111111111");
        System.out.println(student1.getStudentNumber());
        System.out.println(student1.getName());
        System.out.println(student1.getAddress());
        System.out.println(student1.getTel());
        System.out.println(student1.toString());
    }

    Student(String studentNumber, String name, String address, String tel){
        this.studentNumber = studentNumber;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "a Student(" + getStudentNumber() + "," + getName() + "," + getAddress() + "," + getTel() + ")";
    }
}
