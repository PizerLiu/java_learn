package project.Service.Impl;

import org.redisson.api.*;
import org.springframework.web.bind.annotation.RestController;
import project.Service.RedissonTestService;
import project.common.utils.RedissonUtils;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class RedissonTestServiceImpl implements RedissonTestService {
    public String getRedissonClient() {

        try {
            RedissonClient redisson = RedissonUtils.redissonInt();
            //Test1
//            RObject bucket = redisson.getBucket("Once_EDIT_SUMMARY");
//            boolean is_exist = bucket.isExists();
//            System.out.println("Once_EDIT_SUMMARY----是否存在---"+is_exist);
            //Test2
            RKeys bucket = redisson.getKeys();
            Object[] Onces =  bucket.findKeysByPattern("Once_*").toArray();
            for (Object Once:Onces) {
                System.out.println(redisson.getBucket(Once.toString()).get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return "asd";
    }

}
