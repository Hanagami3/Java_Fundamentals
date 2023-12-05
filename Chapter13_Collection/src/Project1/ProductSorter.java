package Project1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductSorter {

    private List<Product> products;
    private List<FoodProduct> foodProducts = new LinkedList<>();
    private List<HealthProduct> healthProducts = new LinkedList<>();
    private List<ElectricProduct> electricProducts = new LinkedList<>();

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public void numberOfProduct(){
        System.out.println(products.size());
    }

    public void sortProduct(List<Product> productList ){
        products = new ArrayList<>();
        //products.add(new Product("",0));
        HashSet<Integer> x = new HashSet<>();
        for (int i = 0; i < productList.size(); i++)
            x.add(productList.get(i).getProductID());
        List<Integer> y = new ArrayList<>(x);
        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if (productList.get(i).getProductID() != y.get(j))
                    products.add(productList.get(i));
            }
        }
        HashSet<Product> z = new HashSet<>(products);
        products.clear();
        products.addAll(z);
        for (Product product : products)
            if (product instanceof FoodProduct)
                foodProducts.add((FoodProduct) product);
            else if (product instanceof HealthProduct)
                healthProducts.add((HealthProduct) product);
            else if (product instanceof ElectricProduct)
                electricProducts.add((ElectricProduct) product);
    }
}
