import java.util.ArrayList;
public class Shopping {
    public static void main(String[] args) {
        ArrayList<String> market = new ArrayList<>();
        market.add("Bread");
        market.add("Milk");
        market.add("Cocount");
        market.add("Poridge");
        market.add("Banana");
        System.out.println(market);
        System.out.println("Всего товаров: "+ market.size());
        System.out.println("Есть ли молоко? "+ market.contains("Milk"));
        System.out.println("Есть ли сыр? "+ market.contains("Cheese"));
        for(String name : market){
            System.out.println("Название: "+ name);
        }
        System.out.println("первый: "+market.get(0));
        System.out.println("второй: "+market.get(1));
        System.out.println("третий: "+market.get(2));
        System.out.println("четвертый: "+market.get(3));
        System.out.println("пятый: "+market.get(4));
    }
}