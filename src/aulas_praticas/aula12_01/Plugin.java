package aulas_praticas.aula12_01;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

abstract class PluginManager {

    public static IPlugin load(String name) throws Exception {
        Class<?> c = Class.forName(name);
        return (IPlugin) c.newInstance();
    }
}

public class Plugin {

    public static void main(String[] args) throws Exception {
        File proxyList = new File("src/aula12_01_reflection/plugins");
        ArrayList<IPlugin> plgs = new ArrayList<IPlugin>();
        for (String f : proxyList.list()) {
            try {
                plgs.add(PluginManager.load("aula12_01_reflection.plugins."
                        + f.substring(0, f.lastIndexOf('.'))));
            } catch (Exception e) {
                System.out.printf("Plugin invalido\n", f);
            }
        }
        Iterator<IPlugin> it = plgs.iterator();
        while (it.hasNext()) {
            it.next().fazQualQuerCoisa();
        }
    }
}
