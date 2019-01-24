package utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by davidevincenzodilecce on 24/01/2019.
 */
public class ApplicationContextProvider {

    private static ApplicationContext applicationContext;


    public static ApplicationContext provide() {
        if(applicationContext == null) {
            applicationContext = new ClassPathXmlApplicationContext("/META-INF/application.xml");
        }
        return applicationContext;
    }

}