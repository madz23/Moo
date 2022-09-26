package moo.game;

import com.badlogic.gdx.graphics.g2d.Animation;

public abstract class Creature {
    private final String spritePath;

    private int posX;
    private int posY;
    private boolean flip;
    private int speed;

    private Animation walkAnimation;
    private Animation standAnimation;

    

    public Creature(String spritePath) {
        this.spritePath = spritePath;
    }
}
