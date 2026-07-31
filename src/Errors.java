public class Errors {
    public static void main(String[] args) {
        int a =10;
        int b =0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: нельзя делить на ноль!"+e.getMessage());
        }
        System.out.println("А эта строка теперь выполнится");
    }
}
