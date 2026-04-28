class Student {

    private String name;
    private int rollNo;
    private float marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }
}

public class Q3{
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Vivek");
        s.setRollNo(19);
        s.setMarks(88.5f);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Marks: " + s.getMarks());
    }
}