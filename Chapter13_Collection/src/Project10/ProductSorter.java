package Project10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductSorter {

    private List<Product> products = new ArrayList<>();
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

    public void sortProduct(Product product){
        String IDN;
        String ID = "";
        if (product.toString().charAt(product.toString().length()-4) == '=')
            IDN = product.toString().substring(product.toString().length()-3, product.toString().length()-1);
        else if (product.toString().charAt(product.toString().length()-3) == '=')
            IDN = String.valueOf(product.toString().charAt(product.toString().length()-2));
        else
            IDN = product.toString().substring(product.toString().length()-4, product.toString().length()-1);

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).toString().charAt(products.get(i).toString().length()- 4) == '=')
                ID = products.get(i).toString().substring(products.get(i).toString().length() - 3, products.get(i).toString().length() - 1);
            else if (products.get(i).toString().charAt(products.get(i).toString().length() - 3) == '=')
                ID = String.valueOf(products.get(i).toString().charAt(products.get(i).toString().length() - 2));
            else
                ID = products.get(i).toString().substring(products.get(i).toString().length() - 4, products.get(i).toString().length() - 1);
        }
        if (!(IDN.toString().equals(ID.toString()))) {
            products.add(product);
            if (product instanceof FoodProduct)
                foodProducts.add((FoodProduct) product);
            else if (product instanceof HealthProduct)
                healthProducts.add((HealthProduct) product);
            else if (product instanceof ElectricProduct)
                electricProducts.add((ElectricProduct) product);
        }
        System.out.println(IDN + " | " + ID);


    }
}
