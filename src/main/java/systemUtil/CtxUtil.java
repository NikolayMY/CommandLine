package systemUtil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CtxUtil {

    public static ApplicationContext applicationContext;

    public static ApplicationContext getContext(){
        if (applicationContext == null){
            return applicationContext = new ClassPathXmlApplicationContext("utils.xml");
        }

        return applicationContext;
    }
}
