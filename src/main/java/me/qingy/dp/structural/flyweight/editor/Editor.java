package me.qingy.dp.structural.flyweight.editor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qingy
 * @since 2021-08-03
 */
public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, CharacterStyleFactory.getStyle(font, size, colorRGB));
        chars.add(character);
    }
}
