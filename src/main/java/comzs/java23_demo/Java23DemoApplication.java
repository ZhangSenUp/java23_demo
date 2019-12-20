package comzs.java23_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("comzs.java23_demo.dao")
public class Java23DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java23DemoApplication.class, args);
    }

}
