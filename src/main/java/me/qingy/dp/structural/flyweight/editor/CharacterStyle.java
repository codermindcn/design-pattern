package me.qingy.dp.structural.flyweight.editor;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

/**
 * 享元类
 * 在一个文本文件中，用到的字体格式不会太多，毕竟不大可能有人把每个文字都设置成不同的格式。
 * 所以，对于字体格式，我们可以将它设计成享元，让不同的文字共享使用。
 *
 * @author qingy
 * @since 2021-08-03
 */
@Getter
@Setter
public class CharacterStyle {
    private Font font;
    private int size;
    private int colorRGB;

    public CharacterStyle(Font font, int size, int colorRGB) {
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }

    @Override
    public boolean equals(Object o) {
        CharacterStyle otherStyle = (CharacterStyle) o;
        return font.equals(otherStyle.font)
                && size == otherStyle.size
                && colorRGB == otherStyle.colorRGB;
    }
}
