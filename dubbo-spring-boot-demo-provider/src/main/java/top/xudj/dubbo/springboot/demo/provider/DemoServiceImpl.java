package top.xudj.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import top.xudj.dubbo.springboot.demo.DemoService;

/**
 * 通过@DubboService发布dubbo服务
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

}
