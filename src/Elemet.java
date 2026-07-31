import java.util.ArrayList;

public class Elemet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        try {
            System.out.println(list.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка такого элемента нет. Сообщение ошибки: "+e.getMessage());
        }
    }
}
