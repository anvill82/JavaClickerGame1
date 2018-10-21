package com.homemade.game;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    private Image dragon;

    public Board() {
        initBoard();
    }

    public void initBoard() {

        loadImage();

        int w = dragon.getWidth(this);
        int h = dragon.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("resources/dragon.png");
        dragon = ii.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(dragon, 0, 0, null);
    }
}
