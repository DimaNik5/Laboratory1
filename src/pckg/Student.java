package pckg;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] marks;

    public Student(String name, String group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public int getMidleMark(){
        int res = 0;
        for (int mark : marks) {
            res += mark;
        }
        return res/marks.length;
    }

    public int getCourse() {
        return course;
    }

    public void addCourse(){
        course++;
    }

    @Override
    public String toString() {
        return "Student " + name + " of group " + group + " " + course + " course with middle mark " + getMidleMark();
    }
}
