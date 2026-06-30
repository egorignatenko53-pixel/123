public class Ptactice {
    static void printBook(String bookName) {
        System.out.println("Ты любишь книги?"+ bookName);
    }
    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
    }
    public static void main(String[] args) {
        printBook("Atomic Habits");
        checkAge(18);
        checkAge(17);
        checkAge(1);
        checkAge(99);
        checkAge(0);
        checkAge(-1);
    }
}
