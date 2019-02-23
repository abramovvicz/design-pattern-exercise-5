package product;

import strategry.*;

public class ProductService {
    public static double christmasDiscount(double cost) {
        return 0.15 * cost;
    }

    public static double easterDiscount(double cost) {
        return 0.10 * cost;
    }

    public static double newYearDiscount(double cost) {
        return 0.2 * cost;
    }
///test git

//    public void chooseDiscount(Product product, DiscountType discountType) {
//        ProductStrategy productStrategy;
//
//        if (discountType.equals(DiscountType.EASTER)) {
//            productStrategy = new StrategyChristmas();
//            productStrategy.countDiscount(product.getCost());
//        } else if (discountType.equals(DiscountType.CHRISTMAS)) {
//            productStrategy = new StrategyEaster();
//            productStrategy.countDiscount(product.getCost());
//        } else if (discountType.equals(DiscountType.NEWYEAR)) {
//            productStrategy = new StrategyNewYear();
//            productStrategy.countDiscount(product.getCost());
//        }
//    }


}
