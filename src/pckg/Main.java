package pckg;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("First", "ABC", 1, new int[] {2, 3, 4, 5}));
        listStudents.add(new Student("Second", "BCD", 2, new int[] {1, 3, 2, 5}));
        listStudents.add(new Student("Third", "CDE", 2, new int[] {4, 3, 4, 5}));
        listStudents.add(new Student("Four", "DEF", 3, new int[] {5, 4, 4, 5}));
        listStudents.add(new Student("Five", "EFG", 3, new int[] {2, 3, 4, 1}));

        printStudents(listStudents, 1);
        printStudents(listStudents, 2);
        printStudents(listStudents, 3);
        printStudents(listStudents, 4);

        checkMark(listStudents);

        printStudents(listStudents, 1);
        printStudents(listStudents, 2);
        printStudents(listStudents, 3);
        printStudents(listStudents, 4);

    }

    public static void checkMark(List<Student> students){
        int i = 0;
        while(i < students.size()){
            if(students.get(i).getMidleMark() >= 3){
                students.get(i).addCourse();
            }
            else{
                students.remove(i);
                i--;
            }
            i++;
        }
    }

    public static void printStudents(List<Student> students, int course){
        System.out.println("\nStudents " + course + " course:");
        Boolean f = true;
        for(Student st : students) {
            if (st.getCourse() == course) {
                System.out.println(st);
                f = false;
            }
        }
        if(f) System.out.println("Don't have");
    }
}
