package me.qingy.dp.structural.flyweight.editor;

import lombok.Getter;
import lombok.Setter;

/**
 * @author qingy
 * @since 2021-08-03
 */
@Setter
@Getter
public class Character {
    private char c;
    private CharacterStyle style;

    public Character(char c, CharacterStyle style) {
        this.c = c;
        this.style = style;
    }
}
