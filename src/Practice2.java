import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(40);
        numbers.add(15);
        System.out.println(numbers);
        System.out.println("Сколько всего чисел: " +numbers.size());
        System.out.println("Естьли число 25?"+numbers.contains(25));
        System.out.println("Естьли число 100?"+numbers.contains(100));
        System.out.println("Первое число: "+numbers.get(0));
        System.out.println("Последнее число: "+numbers.get(4));
        int sum= 0;
        for(int n:numbers){
            sum +=n;
        }
        System.out.println("Сумма: " + sum);
        }
}
