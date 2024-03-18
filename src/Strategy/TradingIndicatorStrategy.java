package Strategy;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    double CalculateTradingIndicator(Stock stock);
}
