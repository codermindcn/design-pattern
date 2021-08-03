package me.qingy.dp.structural.flyweight.editor.normal;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

/**
 * 文字
 *
 * @author qingy
 * @since 2021-08-03
 */
@Getter
@Setter
public class Character {
    private char c;
    private Font font;
    private int size;
    private int colorRGB;

    public Character(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}
