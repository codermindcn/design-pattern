package me.qingy.dp.structural.flyweight.editor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 享元工厂类
 *
 * @author qingy
 * @since 2021-08-03
 */
public class CharacterStyleFactory {
    private static final List<CharacterStyle> styles = new ArrayList<>();

    public static CharacterStyle getStyle(Font font, int size, int colorRGB) {
        CharacterStyle newStyle = new CharacterStyle(font, size, colorRGB);
        for (CharacterStyle style : styles) {
            if (style.equals(newStyle)) {
                return style;
            }
        }
        styles.add(newStyle);
        return newStyle;
    }
}
