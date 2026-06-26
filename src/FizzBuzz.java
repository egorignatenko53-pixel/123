public class FizzBuzz {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Вообше топ: "+i);
            }else if (i % 3 == 0) {
                System.out.println("нечетный числа: "+i);
            }else if (i % 5 == 0) {
                System.out.println("четный числа: "+i);
            }
            if (i % 2 == 0) {}
            sum = sum + i;
        }
        System.out.println("Сумма чисел: "+sum);
    }
}