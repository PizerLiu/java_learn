package project.common.utils;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import static java.lang.String.*;

@Service
public class RedissonUtils {

    private RedissonClient redissonClient;

    //创建redssion实例
    public static RedissonClient redissonInt() throws URISyntaxException, IOException {

        URL dir_url = ClassLoader.getSystemResource("redisson.yaml");
        File dir = new File(dir_url.toURI());
        Config config = Config.fromYAML(new File(valueOf(dir)));
        RedissonClient redisson = Redisson.create(config);

        return redisson;
    }

}
