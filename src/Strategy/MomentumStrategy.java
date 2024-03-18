package Strategy;

public class MomentumStrategy implements TradingIndicatorStrategy {
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public double CalculateTradingIndicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}
