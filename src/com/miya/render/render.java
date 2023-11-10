package com.miya.render;
import com.miya.screen.screenMana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class render extends JPanel {
    screenMana gotopaint;
    public render(screenMana screenmana,int fps){
        Timer repaint = new Timer(fps / 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           repaint();
            }
        });
        gotopaint = screenmana;
        repaint.start();
        System.out.println("hello miya");
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int a=0;a<gotopaint.getNull();a++){
            for (int b=0;b<gotopaint.screens[a].screen.length;b++){
                for (int c=0;c<gotopaint.screens[a].screen[b].length;c++){
                    g.setColor(gotopaint.screens[a].screen[b][c].color);
                    g.drawLine(b,c,b,c);

                }
            }
        }
    }

}
