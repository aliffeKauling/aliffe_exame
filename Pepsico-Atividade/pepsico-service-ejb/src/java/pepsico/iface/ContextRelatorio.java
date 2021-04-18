package pepsico.iface;

public class ContextRelatorio {

    private StrategyRelatorio strategy;

    public ContextRelatorio(StrategyRelatorio strategy) {
        this.strategy = strategy;
    }

    public int executaRelatorio() {
        return strategy.quantidade();
    }
}
