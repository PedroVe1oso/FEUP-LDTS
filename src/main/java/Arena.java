import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {
    private final Hero hero;

    private List<Wall> walls;
    private List<Coin> coins;
    private int width;
    private int height;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;

        hero = new Hero(width / 2, height / 2);

        this.walls = createWalls();
        this.coins = createCoins();
    }

    public void draw(TextGraphics graphics) throws IOException {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#f20f0f"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');

        hero.draw(graphics);

        for (Wall wall : walls) {
            wall.draw(graphics);
        }

        for (Coin coin : coins) {
            coin.draw(graphics);
        }
    }

    public void processKey(KeyStroke key){
        switch (key.getKeyType()) {
            case ArrowUp -> moveHero(hero.moveUp());
            case ArrowDown -> moveHero(hero.moveDown());
            case ArrowLeft -> moveHero(hero.moveLeft());
            case ArrowRight -> moveHero(hero.moveRight());
            default -> System.out.println("Key not handled");
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

        for (Wall wall : walls) {
            if ((wall.getPosition().equals(position))) return false;
        }

        return true;
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c,0));
            walls.add(new Wall(c,height - 1));
        }

        for (int r = 0; r < height - 1; r++) {
            walls.add(new Wall(0,r));
            walls.add(new Wall(width - 1,r));
        }

        return walls;
    }

    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();

        for (int i = 0; i < 5; i++)
            coins.add(new Coin(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));

        return coins;
    }
}
