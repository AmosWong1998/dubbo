package pers.amos.demo.spi.adaptive;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author amos wong
 * @create 2023-02-17 21:22
 */

public class DubboAdaptiveSPITest {
    public static void main(String[] args) {
        ExtensionLoader<HumanAdaptive> extensionLoader = ExtensionLoader.getExtensionLoader(HumanAdaptive.class);
        HumanAdaptive humanAdaptive = extensionLoader.getAdaptiveExtension();

        Map<String, String> parameters = new HashMap<>();
        parameters.put("human", "male");
        URL url = new URL("dubbo", "127.0.0.1", 20880, parameters);
        System.out.println(url.getParameter("human"));
        humanAdaptive.introduce(url);
    }
}
