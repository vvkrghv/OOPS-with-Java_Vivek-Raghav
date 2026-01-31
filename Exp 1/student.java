class student {
    int rollNo;
    String name;
    double marks;
    student() {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0.0;
    }
    student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
        student s2 = new student(101, "Vivek", 88.5);
        s2.display();
    }
}
