package edu.shily.springboot;

import edu.shily.springboot.bean.Pet;
import edu.shily.springboot.bean.User;
import edu.shily.springboot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序，主配置类
 * @SpringBootApplication：告诉Spring这是一个SpringBoot程序
 */
@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        //1.返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Springboot01Application.class, args);

        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }

        //3.从容器中获取组件
        // Pet tom = run.getBean("tom", Pet.class);
        // Pet tom01 = run.getBean("tom", Pet.class);
        //
        // System.out.println(tom == tom01);
        //
        // MyConfig bean = run.getBean(MyConfig.class);
        // System.out.println(bean);
        //
        // User user = bean.user01();
        // User user1 = bean.user01();
        // System.out.println(user == user1);
        //
        //
        // //5、获取组件
        // String[] beanNamesForType = run.getBeanNamesForType(User.class);
        // System.out.println("===============");
        // for (String s : beanNamesForType) {
        //     System.out.println(s);
        // }

        // DBHelper bean1 = run.getBean(DBHelper.class);
        // System.out.println(bean1);

        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件"+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件"+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中Tom22组件"+tom22);

        boolean haha = run.containsBean("haha");
        System.out.println("容器中haha组件"+haha);

        boolean hehe = run.containsBean("hehe");
        System.out.println("容器中hehe组件"+hehe);
    }

}
