package project.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


public interface RedissonTestService {
    @ResponseBody
    @RequestMapping("/asd")
    String getRedissonClient();
}
