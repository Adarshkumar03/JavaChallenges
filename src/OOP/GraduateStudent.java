package OOP;

public class GraduateStudent extends Student{
    private String course;

    public GraduateStudent(int name, int rollNumber, int marks, String course) {
        super(name, rollNumber, marks);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Course: " + getCourse());
    }
}
