package Project1;

import java.util.Random;

public class ProductFactory {

    private ProductSorter productSorter;
    private String[] foodProduct = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter){
        this.productSorter = productSorter;
    }

    public Product createProducts(int amount){
        Random random = new Random();
        Product product = new Product("", 1);
        for (int i = 0; i < amount; i++ ){
        int productID = random.nextInt(150);
        int soort = random.nextInt(3);
        switch (soort) {
            case 0:
                product = new FoodProduct(foodProduct[productID / 30 - 1], productID);
            break;
            case 1:
                product = new HealthProduct(healthProducts[productID / 30 - 1], productID);
            break;
            case 2:
                product = new ElectricProduct(electricProducts[productID / 30 - 1], productID);
            break;
        }
        }

    return product;
    }
}