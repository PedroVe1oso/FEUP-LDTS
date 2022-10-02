import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {
    private final Hero hero;
    private int width;
    private int height;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;

        hero = new Hero(width / 2, height / 2);
    }

    public void draw(Screen screen) throws IOException {
        hero.draw(screen);
    }

    public void processKey(KeyStroke key){
        switch(key.getKeyType()){
            case ArrowUp:
                moveHero(hero.moveUp());
                break;
            case ArrowDown:
                moveHero(hero.moveDown());
                break;
            case ArrowLeft:
                moveHero(hero.moveLeft());
                break;
            case ArrowRight:
                moveHero(hero.moveRight());
                break;
            default:
                System.out.println("Key not handled");
        }
    }

    private void moveHero(Position position) {
        if (canHeroMove(position)) hero.setPosition(position);
    }

    private boolean canHeroMove(Position position) {
        if (position.getX() < 0) return false;
        if (position.getX() > width - 1) return false;
        if (position.getY() < 0) return false;
        if (position.getY() > height - 1) return false;

        return true;
    }
}
