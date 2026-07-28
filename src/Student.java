public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public boolean isPassed() {
        return this.grade >= 60;
    }
    public void printInfo() {
        System.out.println(this.name + " -оценка " + this.grade);
    }
}