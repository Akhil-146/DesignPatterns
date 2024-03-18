import Strategy.*;

import java.util.Random;

public class StrategyClient {
    public static void main(String[] args) {
        TradingIndicatorStrategy tradingIndicatorStrategy = getTradingIndicatorStrategy();
        System.out.println("TradingIndicatorStrategy: " +tradingIndicatorStrategy.supportsType());

        StockTradingManager stockTradingManager = new StockTradingManager(tradingIndicatorStrategy);
        double priceIndicator = stockTradingManager.calculateIndicator(new Stock(20, 15));
        System.out.println(priceIndicator);
    }

    public static TradingIndicatorStrategy getTradingIndicatorStrategy() {
        Random random = new Random();
        int num = random.nextInt(1, 4);
        if (num == 1)
            return new MovingAveragesStrategy();
        else if (num == 2)
            return new MomentumStrategy();
        else
            return new VolatilityStrategy();
    }
}
