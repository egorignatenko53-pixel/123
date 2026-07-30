import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> grades  = new HashMap<>();
        grades.put("Egor",83);
        grades.put("Alina",90);
        grades.put("Ivan",56);
        System.out.println(grades);
        System.out.println("Оценка Egor: " +grades.get("Egor"));
        System.out.println("Сколько всего оценок: "+grades.size());
        System.out.println("Есть ли такой ключ: "+grades.containsKey("Ivan"));
    }
}
