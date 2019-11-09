package com.luopeng.ui;

//import com.luopeng.factory.BeanFactory;
import com.luopeng.dao.IAccountDao;
import com.luopeng.service.IAccountService;
import com.luopeng.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class client {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // 1、获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        IAccountService as = (IAccountService)ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();
        ac.close();
//        IAccountDao adao = (IAccountDao) ac.getBean("accountDao");
//        System.out.println(adao);
    }
}
