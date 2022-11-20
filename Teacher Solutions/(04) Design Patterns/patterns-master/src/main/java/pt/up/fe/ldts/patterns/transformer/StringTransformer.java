package pt.up.fe.ldts.patterns.transformer;

import pt.up.fe.ldts.patterns.StringDrink;

/**
 * @author Tatiana Fritzová
 */
public interface StringTransformer {
    void execute(StringDrink drink);
    void undo(StringDrink drink);
}
