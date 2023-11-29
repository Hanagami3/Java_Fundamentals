package Project1;

public class ProductApp {

    public static void main(String[] args) {



        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);

        int amount = 10;
        for (int i = 0; i < amount; i++)
        productSorter.sortProduct(productFactory.createProducts(amount));
        productSorter.numberOfProduct();
        System.out.println(productSorter.getElectricProducts());
        System.out.println(productSorter.getFoodProducts());
        System.out.println(productSorter.getHealthProducts());
    }
}
