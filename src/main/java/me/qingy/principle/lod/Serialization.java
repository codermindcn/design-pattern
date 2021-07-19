package me.qingy.principle.lod;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.Map;

/**
 * 即满足迪米特法则（隔离），又满足高内聚思想
 *
 * @see me.qingy.principle.solid.srp.Serialization 单一职责中过度拆分违背高内聚的 Demo
 * @author qingy
 * @since 2021-06-11
 */
public class Serialization implements Serializable, Deserializable{
    private static final String IDENTIFIER_STRING = "UEUEUE;";
    private Gson gson;

    public Serialization() {
        this.gson = new Gson();
    }

    @Override
    public String serialize(Map<String, String> object) {
        StringBuilder textBuilder = new StringBuilder();
        textBuilder.append(IDENTIFIER_STRING);
        textBuilder.append(gson.toJson(object));
        return textBuilder.toString();
    }

    @Override
    public Map<String, String> deserialize(String text) {
        if (!text.startsWith(IDENTIFIER_STRING)) {
            return Collections.emptyMap();
        }
        String gsonStr = text.substring(IDENTIFIER_STRING.length());
        return gson.fromJson(gsonStr, Map.class);
    }

}

