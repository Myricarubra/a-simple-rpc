package test.rpcdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.imageio.spi.ServiceRegistry;


/**
 * Created by ZhangDong on 2018/4/2.
 */

/**
 * rpc框架服务器
 * 使用时可由用户通过spring注入到业务中
 * 实现了ApplicationContextAware和InitializingBean
 * spring构造对象时对调用setApplicationContext()方法，从而在方法中通过自定义的注解获得beanmap
 * 还会调用afterPropertiesSet()方法，在这个方法中启动netty服务器
 */
public class RpcServer implements ApplicationContextAware, InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(RpcServer.class);
    private String serverAddress;
    private ServiceRegistry serviceRegistry;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
