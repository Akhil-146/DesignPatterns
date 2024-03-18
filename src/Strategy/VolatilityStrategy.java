package Strategy;

public class VolatilityStrategy implements TradingIndicatorStrategy {
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public double CalculateTradingIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}
