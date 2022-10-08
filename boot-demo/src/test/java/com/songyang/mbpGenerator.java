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
        FastAutoGenerator.create("jdbc:mysql://43.143.139.24:3306/yiran", "root", "songyang.top@@##$$")
                .globalConfig(builder -> {
                    builder.author("Yang Song") // 设置作者
                            .outputDir("C:\\Users\\Mr.Song\\Desktop\\1"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.yiran") // 设置父包名
                            .moduleName("model") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Users\\Mr.Song\\Desktop\\1")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("brand,cart,collections,color,comments,coupon," +
                            "flow,inventory,like,multi_menu,order_details,orders,pro_attribute_info," +
                            "pro_image,product,receive_address,receive_coupon,size,users"); // 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
