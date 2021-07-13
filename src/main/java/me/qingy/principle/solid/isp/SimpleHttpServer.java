package me.qingy.principle.solid.isp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 配置展示服务器
 *
 * @author qingy
 * @since 2021/6/9
 */
public class SimpleHttpServer {

    private String host;
    private int port;
    private Map<String, List<Viewer>> viewers = new HashMap<>();

    public SimpleHttpServer(String host, int port) {
        //...
    }

    public void addViewer(String urlDirectory, Viewer viewer) {
        if (!viewers.containsKey(urlDirectory)) {
            viewers.put(urlDirectory, new ArrayList<>());
        }
        this.viewers.get(urlDirectory).add(viewer);
    }

    public void run() {
        //...
    }
}
