package cn.qiankunpingtai.spider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName SpiderApplication
 * Describe:
 *
 * @Author sean
 * @Date 2019/05/25
 * @Version 1.0
 */
@MapperScan("cn.qiankunpingtai.spider.mappers")
@SpringBootApplication
public class SpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderApplication.class, args);
    }

}
