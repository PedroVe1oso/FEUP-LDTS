package pt.up.fe.ldts.patterns.bar.client;

import pt.up.fe.ldts.patterns.bar.strategy.OrderingStrategy;
import pt.up.fe.ldts.patterns.bar.strategy.SmartStrategy;

public class FerengiClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
