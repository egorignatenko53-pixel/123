public class Main {
    public static void main(String[] args) {
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
        System.out.println("Меня зовут: " +user1.name);
        System.out.println("Мне "+user1.age+ " и снизу я приведу примеры арифметики тебе Алина");
        System.out.println("Сумма:"+ (a + b));
        System.out.println("Умножение:"+ (a * b));
        System.out.println("Разность:"+ (a - b));
        System.out.println("Остаток:"+ (a % b));
        System.out.println("деление:"+ (a / b));
        System.out.println("Понятно? И напомни как тебя зовут и сколько тебе лет");
        System.out.println("Да,все понятно. Меня зовут "+user2.name +" и мне "+user2.age);
        System.out.println("Приятно познокомиться "+user2.name+ "Моя любтиамя книга "+book1.name+" Она была издана в"+ book1.year+ " Какая твоя любимая книга?");
        System.out.println("Моя любимая книга "+book2.name+" Она была издана в "+ book2.year);

    }
}