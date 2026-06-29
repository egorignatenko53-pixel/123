public class Main {
    static void hello() {
        System.out.println("Привет из метода!");
    }

    static void printUser(String name, int age) {
        System.out.println("Меня зовут: " + name);
        System.out.println("Мне " + age + " лет");
    }
    static void printBook(String name, int year) {
        System.out.println("Книга: " + name + ", год: " + year);
    }

    public static void main(String[] args) {
        hello();
        int a = 777;
        int b = 222;
        User user1 = new User();
        user1.name = "Egor";
        user1.age = 21;
        User user2 = new User();
        user2.name = "Alina";
        user2.age = 21;
        Book book1 = new Book();
        book1.name = "Atomic habits";
        book1.year = 2021;
        Book book2 = new Book();
        book2.name = "Harry Potter";
        book2.year = 2004;
        printUser(user1.name, user1.age);
        System.out.println("Сумма:"+ (a + b));
        System.out.println("Умножение:"+ (a * b));
        System.out.println("Разность:"+ (a - b));
        System.out.println("Остаток:"+ (a % b));
        System.out.println("деление:"+ (a / b));
        System.out.println("Понятно? И напомни как тебя зовут и сколько тебе лет");
        printUser(user2.name, user2.age);
        printBook(book1.name, book1.year);
        printBook(book2.name, book2.year);

    }
}
