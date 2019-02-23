package strategry;

import product.Product;

public class StrategyChristmas implements ProductStrategy {
    @Override
    public void countDiscount(Product product) {
        product.setDiscount(0.15);
    }
}
