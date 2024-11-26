package by.teachmeskills.yadevich.lesson15.task4;

import by.teachmeskills.yadevich.lesson15.task4.model.Group;
import by.teachmeskills.yadevich.lesson15.task4.model.student.Student;
import by.teachmeskills.yadevich.lesson15.task4.model.teacher.Teacher;

import java.util.HashSet;
import java.util.Set;

/** Task 4.
 Create a collection of unique names of all students in our group + the teacher.
 Display the collection on the screen.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Set<Group> ourGroup = new HashSet<>();
        Student student1 = new Student("Marina");
        Student student2 = new Student("Kate");
        Student student3 = new Student("Oleg");
        Student student4 = new Student("Kirill");
        Student student5 = new Student("Flaffic");
        Student student6 = new Student("Rita");
        Student student7 = new Student("Ilya");
        Student student8 = new Student("Flame-host");
        Student student9 = new Student("Dmitry");
        Student student10 = new Student("Vlad");
        Student student11 = new Student("Igor");
        Student student12 = new Student("Sergio");
        Student student13 = new Student("Dmitry");
        Student student14 = new Student("Daniil");
        Student student15 = new Student("Sultan");
        Teacher teacher = new Teacher("Andrew");

        ourGroup.add(student1);
        ourGroup.add(student2);
        ourGroup.add(student3);
        ourGroup.add(student4);
        ourGroup.add(student5);
        ourGroup.add(student6);
        ourGroup.add(student7);
        ourGroup.add(student8);
        ourGroup.add(student9);
        ourGroup.add(student10);
        ourGroup.add(student11);
        ourGroup.add(student12);
        ourGroup.add(student13);
        ourGroup.add(student14);
        ourGroup.add(student15);
        ourGroup.add(teacher);

        for(Group members : ourGroup){
            System.out.println(members);
        }
    }
}
