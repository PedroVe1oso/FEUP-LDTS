package pt.up.fe.ldts.patterns.bar.client;

import pt.up.fe.ldts.patterns.bar.strategy.ImpatientStrategy;
import pt.up.fe.ldts.patterns.bar.strategy.OrderingStrategy;

public class RomulanClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
