package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import bt.edu.gcit.config.Appconfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new AnnotationConfigApplicationContext(Appconfig.class);

        // Desktop dt = context.getBean("comp",Desktop.class);
        // dt.compile();

        // Desktop dt1 = context.getBean(Desktop.class);
        // dt1.compile();

        Alien obj = context.getBean(Alien.class);
        obj.code();






        // System.out.println("Hello world!");

        // Alien obj = new Alien();
        // obj.code();

        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// creates a container
        // Alien obj = (Alien) context.getBean("alien"); // variable to store the objs  to get the type Alien 

        // OR
        // Alien obj = context.getBean("alien", Alien.class);
        // obj.code();




        // System.out.println(obj.getAge());

        // Alien obj = (Alien) context.getBean("alien"); // creates
        // obj.code();
        // Alien obj1 = (Alien) context.getBean("alien"); // creates
        // obj.code();
    }
}