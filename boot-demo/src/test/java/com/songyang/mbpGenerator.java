package com.songyang;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

/**
 * @author Yang Song
 * @date 2022/9/22 10:55
 */
@SpringBootTest
public class mbpGenerator {
    @Test
    public void generator(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/alipay", "root", "root")
                .globalConfig(builder -> {
                    builder.author("Yang Song") // 设置作者
                            .outputDir("C:\\Users\\Mr.Song\\Desktop\\1"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com") // 设置父包名
                            .moduleName("songyang") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Users\\Mr.Song\\Desktop\\1")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user,product,orders,flow"); // 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
