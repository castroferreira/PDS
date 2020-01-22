package aulas_praticas.aula12_01.plugins;

import aulas_praticas.aula12_01.IPlugin;

/**
 * PDS 2017/2018 G29
 *
 * @author Andreia Ferreira
 * @author Rui Serrano
 */
public class SomePlugin implements IPlugin {

    @Override
    public void fazQualQuerCoisa() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("ok plugin!");
    }
}
