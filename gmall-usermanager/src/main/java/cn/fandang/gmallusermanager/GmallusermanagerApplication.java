package cn.fandang.gmallusermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.fandang.gmallusermanager.mapper")
public class GmallusermanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallusermanagerApplication.class, args);
    }

}
