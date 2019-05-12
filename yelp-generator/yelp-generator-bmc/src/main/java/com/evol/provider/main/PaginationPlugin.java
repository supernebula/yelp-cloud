package com.evol.provider.main;

import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.ShellRunner;

import java.util.List;

/**
 * The class Pagination plugin.
 */
public class PaginationPlugin extends PluginAdapter {

    /**
     * Validate boolean
     * @param list
     * @return
     */
    public boolean validate(List<String> list) {
        return true;
    }

    private static void generate(){
        String config = PaginationPlugin.class.getClassLoader().getResource("generator/generatorConfig-A.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite"};
        ShellRunner.main(arg);
    }

    public static void main(String[] args) {
        generate();
    }
}
