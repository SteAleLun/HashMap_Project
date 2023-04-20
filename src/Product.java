public class Product {

    private String name;

    private String manufacturer;

    private int amount;


    public Product (String name, String manufacturer, int amount){
        this.name = name;
        this.name = manufacturer;
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
