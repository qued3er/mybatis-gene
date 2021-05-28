package com.ex.gene;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings=new ArrayList<>();
        InputStream in = MyBatisGenerator.class
                .getClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(in);
        //存在同名是否覆盖
        boolean overwrite=false;
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration,defaultShellCallback, warnings);
        myBatisGenerator.generate(null);
        //打印warning的信息
        warnings.forEach(System.err::println);
    }
}
