package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductFactory {

    private ProductSorter productSorter;
    private String[] foodProduct = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthProducts = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public ProductFactory(ProductSorter productSorter){
        this.productSorter = productSorter;

    }

    public List<Product> createProducts(int amount){
        Random random = new Random();
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < amount; i++ ){
            int productID = random.nextInt(50);
            int soort = random.nextInt(3);
            int name = random.nextInt(5);
            switch (soort) {
                case 0:
                    productList.add(new FoodProduct(foodProduct[name], productID));
                    break;
                case 1:
                    productList.add(new HealthProduct(healthProducts[name], productID));
                    break;
                case 2:
                    productList.add(new ElectricProduct(electricProducts[name], productID));
                    break;
            }
        }
        return productList;
    }
}
