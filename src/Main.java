import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        // Заполним склад
        warehouse.addProduct(new Product("Яблоко", "Яблочник Валера", 6));      // 1
        warehouse.addProduct(new Product("Помидор", "Помидорник Пётр", 4));     // 2
        warehouse.addProduct(new Product("Лук", "Лучник Лука", 2));             // 3
        warehouse.addProduct(new Product("Кабачок", "Кабачник Данил", 8));      // 4
        warehouse.addProduct(new Product("Капуста", "Капустник Пётр", 5));      // 5

        // проверка работы метода getIdThatALot()
        System.out.println("Проверяем метод getIdThatALot(): ");
        warehouse.getIdThatALot();
        System.out.println();

        // проверка работы метода IncreaseByIdList()
        ArrayList<Integer> idList = new ArrayList<>();
        idList.add(2);
        idList.add(3);
        idList.add(5);

        System.out.println("Проверяем метод IncreaseByIdList(): ");

        warehouse.IncreaseByIdList(Warehouse.products, idList);

        // выведем результат после всех манипуляций
        for (Map.Entry<Integer, Product> product : Warehouse.products.entrySet()) {
            System.out.println(product.getValue().getAmount());
        }

    }
}
