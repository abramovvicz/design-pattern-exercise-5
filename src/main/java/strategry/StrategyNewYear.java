package strategry;

import product.Product;

public class StrategyNewYear implements ProductStrategy {
    @Override
    public void countDiscount(Product product) {
        product.setDiscount(0.2);
    }
}
