import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {

    public static final HashMap<Integer, Product> products = new HashMap<>();

    private static int idCount = 1;


    public void addProduct(Product product) {
        products.put(idCount, product);
        idCount++;
    }

    // вывести id продуктов, количество которых > 5
    public void getIdThatALot() {
        for (Map.Entry<Integer, Product> product : products.entrySet()) {
            if (product.getValue().getAmount() > 5) {
                System.out.println(product.getKey());
            }
        }
    }

    // увеличить количество продуктов, список id которых передан в метод, на 10
    public void IncreaseByIdList(HashMap<Integer, Product> products, ArrayList<Integer> idList) {
        for (Map.Entry<Integer, Product> product : products.entrySet()) {
            for (Integer id : idList){
                if (product.getKey() == id){
                    product.getValue().setAmount(product.getValue().getAmount() + 10);
                }
            }
        }
    }

}
