package com.carl.test.proxy.spring.test;

import com.tecsun.framework.basic.dao.BasicDaoLogic;
import com.tecsun.framework.basic.dao.DaoException;
import com.tecsun.framework.basic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Carl on 15-1-5.
 */

public class Hello extends BasicService{



    public void sayHi() {
        System.out.println("Hi...");
        System.out.println("expandDao:" + super.getBasicDao());
        /*try {
            System.out.println("begin..beginTransation..");
            //expandDao.getBasicDao().beginTransation();
            System.out.println("end..beginTransation");
        } catch (DaoException e) {
            System.out.println("error..beginTransation");
            e.printStackTrace();
        }*/
        // throw new RuntimeException("抛出运行时异常");
    }

    public void hi() {
        System.out.println("Hi...Hi...");
    }
}
