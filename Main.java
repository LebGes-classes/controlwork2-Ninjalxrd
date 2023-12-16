import java.util.*;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        student.setInfo();
        student.makeProgramming0();
        student.getScore();
        student2.setInfo();
        student2.makeProgramming0();
        student2.getScore();

        Queue<Student> queue = new LinkedList<>();
        queue.add(student);
        queue.add(student2);

        List<Student> students = new ArrayList<>(queue);
        Collections.sort(students, Comparator.comparing(Student::getScore).reversed());

        int totalStudents = students.size();
        int macbooks = (int) (totalStudents * 0.25);

        System.out.println("Первые " + macbooks + "участников получат макбуки");

        for (int i = 0; i < queue.size(); i ++) {
            System.out.println(students.get(i));
        }



        }
    }