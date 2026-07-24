package pl.tlewandster.task5;

public class Shop {
    private String name;
    private Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProducts() {
        System.out.println("List of products in the store " + name + ":");
        for (Product product : products) {
            product.showProduct();
        }
    }
}
