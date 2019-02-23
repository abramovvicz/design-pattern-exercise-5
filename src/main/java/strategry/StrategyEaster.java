package strategry;

import product.Product;

public class StrategyEaster implements ProductStrategy {
    @Override
    public void countDiscount(Product product) {
        product.setDiscount(0.10);
    }
}

