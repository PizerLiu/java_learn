package project;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

//自动扫描接口注解
@SpringBootApplication
public class SampleController {

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World!";
//    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}