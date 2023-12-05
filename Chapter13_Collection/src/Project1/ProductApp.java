package Project1;

public class ProductApp {

    public static void main(String[] args) {



        ProductSorter productSorter = new ProductSorter();
        ProductFactory productFactory = new ProductFactory(productSorter);

        productSorter.sortProduct(productFactory.createProducts(4));
        productSorter.numberOfProduct();
        System.out.println(productSorter.getElectricProducts());
        System.out.println(productSorter.getFoodProducts());
        System.out.println(productSorter.getHealthProducts());
    }
}
