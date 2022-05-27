package n3exercici1;

public class Student {
    private String name;
    private int age;
    private String course;
    private double calification;

    public Student(String name, int age, String course, double calification) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.calification = calification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCalification() {
        return calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }

    @Override
    public String toString() {
        return  "Nombre: " + name  + ", Edad: " + age + ", Curso: " + course + ", Nota: " + calification;
    }
}
