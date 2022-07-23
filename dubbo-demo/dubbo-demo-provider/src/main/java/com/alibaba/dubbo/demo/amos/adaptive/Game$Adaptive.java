package com.alibaba.dubbo.demo.amos.adaptive;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class Game$Adaptive implements com.alibaba.dubbo.demo.amos.adaptive.Game {
    public void play(com.alibaba.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");

        com.alibaba.dubbo.common.URL url = arg0;
        String extName = url.getParameter("best", url.getParameter("greatest", "zelda"));

        if (extName == null)
            throw new IllegalStateException("Fail to get extension(com.alibaba.dubbo.demo.amos.adaptive.Game) name from url("
                    + url.toString() + ") use keys([best, greatest])");

        com.alibaba.dubbo.demo.amos.adaptive.Game extension = ExtensionLoader
                .getExtensionLoader(Game.class)
                .getExtension(extName);
        extension.play(arg0);
    }
}