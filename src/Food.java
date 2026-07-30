import java.util.HashMap;

public class Food {
    public static void main(String[] args) {
        HashMap<String,Integer> prices = new HashMap<>();
        prices.put("Banana",95);
        prices.put("Coconut",80);
        prices.put("Cake",80);
        prices.put("Pizza",80);
        System.out.println(prices);
        System.out.println("Цена банана: "+prices.get("Banana"));
        System.out.println("Всего позиций : "+prices.size());
        System.out.println("Есть ли кокос? "+prices.containsKey("Coconut"));
        System.out.println("Есть ли молоко? "+prices.containsKey("Milk"));
    }
}
