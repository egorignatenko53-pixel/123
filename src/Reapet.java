public class Reapet {
    static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Egor";
        s1.grade = 85;

        Student s2 = new Student();
        s2.name = "Alina";
        s2.grade = 45;

        System.out.println(s1.name + " — оценка: " + s1.grade);
        System.out.println(s2.name + " — оценка: " + s2.grade);

        int age = 2;
        System.out.println("Я вернулся и меня не было ровно "+ age +" месяца");

        if (age >= 6 ) {
            System.out.println("Прошло много времени");
        }else {
            System.out.println("Прошло немного времени");
        }
        for (int i = 8; i <= 15; i++) {
            System.out.println("Число  " + i);
        }
        greet("Egor");
        greet("Alina");
        System.out.println(s1.name + " сдал? " + isPassed(s1.grade));
        System.out.println(s2.name + " сдала? " + isPassed(s2.grade));
        int[] grades = {45, 70, 88, 30, 95};   // список оценок
        int count = 0;                          // счётчик сдавших (накопитель)

        for (int g : grades) {
            if (isPassed(g)) {
                System.out.println("Оценка " + g + " — сдал");
                count++;                        // +1 к счётчику, если сдал
            } else {
                System.out.println("Оценка " + g + " — не сдал");
            }
        }

        System.out.println("Всего сдали: " + count);
    }
    static boolean isPassed(int grade) {
        return grade >= 60;
    }
}
