package com.alibaba.dubbo.demo.amos.adaptive;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author amos wong
 * @create 2022-07-22 21:14
 */

public class GameTest {

    public static void main(String[] args) {
        ExtensionLoader<Game> extensionLoader = ExtensionLoader.getExtensionLoader(Game.class);
        Game game = extensionLoader.getAdaptiveExtension();
        URL url = new URL("dubbo", "127.0.0.1", 12880);
        url = url.addParameter("game", "zelda");
        game.play(url);
    }
}
