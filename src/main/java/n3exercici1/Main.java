package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Antonio", 35, "JAVA", 10);
        Student student2 = new Student("Miguel", 28, "React", 10);
        Student student3 = new Student("María", 24, "PHP", 9);
        Student student4 = new Student("Víctor", 41, "Data Science", 8);
        Student student5 = new Student("Belén", 17, "Vue JS", 7);
        Student student6 = new Student("Carmen", 16, "JAVA", 9);
        Student student7 = new Student("Guillermo", 18, "JAVA", 4);
        Student student8 = new Student("Rafael", 21, "PHP", 2);
        Student student9 = new Student("Teresa", 31, "React", 6);
        Student student10 = new Student("Luis", 29, "Vue JS", 1);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        //Mostrar por panalla el nombre y la edad de cada alumno:
        students.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
        System.out.println();

        //Filtrar los alumnos cuyo nombre empieza por 'a', asignarlos a una nueva lista y mostrar la nueva lista:
        List<Student> studentsWithA = students.stream().filter(student -> Character.toLowerCase(student.getName().charAt(0)) == 'a').toList();
        studentsWithA.forEach(System.out::println);
        System.out.println();

        //Filtrar y mostrar los alumnos que tienen una nota igual o superior a 5:
        students.stream().filter(student -> student.getCalification() >= 5).forEach(System.out::println);
        System.out.println();

        //Filtrar y mostrar los alumnos que tienen una nota igual o superior a 5 y que no son de PHP:
        students.stream().filter(student -> student.getCalification() >= 5 && !student.getCourse().equalsIgnoreCase("php")).forEach(System.out::println);
        System.out.println();

        //Mostrar los alumnos de JAVA y que son mayores de edad:
        students.stream().filter(student -> student.getCourse().equalsIgnoreCase("java") && student.getAge() >= 18).forEach(System.out::println);
    }
}
