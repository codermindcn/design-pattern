package me.qingy.dp.creational.prototype;

import java.io.*;

/**
 * 深拷贝：先将对象序列化，然后再反序列化成新的对象
 *
 * @author qingy
 * @since 2021-07-29
 */
public class DeepCopyUtil {

    public static Object deepCopy(Object object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(object);

        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);

        return oi.readObject();
    }

}
