package OOP;

public class Student {
    private int name;
    private int rollNumber;
    private int marks;

    public Student(int name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void displayInfo(){
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Marks: " + getMarks());
    }
}
