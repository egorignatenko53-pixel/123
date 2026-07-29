import java.util.ArrayList;
public class Lists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Bob");
        names.add("Carlos");
        names.add("Carl");
        System.out.println(names);
        for(String name : names){
            System.out.println("Имя: " +name);
        }
        System.out.println("Всего Имен: "+ names.size());
        System.out.println("Есть John? "+ names.contains("John"));
        System.out.println("Есть Egor? "+ names.contains("Egor"));
        System.out.println("Первый: "+ names.get(0));
        System.out.println("Второй: "+ names.get(1));

    }
}