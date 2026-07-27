public class Test {

    // ===== СНАЧАЛА ВСЕ МЕТОДЫ (внутри класса, рядом друг с другом) =====

    static void printBook(String bookName) {
        System.out.println("Ты любишь книги? " + bookName);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static boolean isAdult(int age) {
        return age >= 18;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // ===== ПОТОМ main — здесь весь ВЫПОЛНЯЕМЫЙ код (вызовы) =====

    public static void main(String[] args) {

        // возврат числа
        int result = sum(5, 3);
        System.out.println("Результат: " + result);

        // возврат true/false, ловим в переменную
        boolean adult = isAdult(20);
        System.out.println("Совершеннолетний? " + adult);

        // используем метод прямо в if
        if (isAdult(15)) {
            System.out.println("Пускаем");
        } else {
            System.out.println("Не пускаем");
        }

        // проверка чётности через isEven
        boolean even = isEven(10);
        System.out.println("Чётное? " + even);

        if (isEven(7)) {
            System.out.println("7 чётное");
        } else {
            System.out.println("7 нечётное");
        }
        
    }
}
