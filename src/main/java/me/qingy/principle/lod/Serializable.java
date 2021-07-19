package me.qingy.principle.lod;

import java.util.Map;

/**
 * @author qingy
 * @since 2021-06-11
 */
public interface Serializable {
    String serialize(Map<String, String> object);
}
