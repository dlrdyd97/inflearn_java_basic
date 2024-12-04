package class1;

public class Student {

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    String name;
    int age;
    int grade;

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age +
                ", 성적 : " + grade;
    }
}
