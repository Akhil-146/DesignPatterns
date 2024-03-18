package Strategy;

public class StockTradingManager {
    private final TradingIndicatorStrategy tradingIndicatorStrategy;

    public StockTradingManager(TradingIndicatorStrategy tradingIndicatorStrategy) {
        this.tradingIndicatorStrategy = tradingIndicatorStrategy;
    }

    public double calculateIndicator(Stock stock) {
        return tradingIndicatorStrategy.CalculateTradingIndicator(stock);
    }
}
