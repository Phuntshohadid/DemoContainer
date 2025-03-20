package bt.edu.gcit.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


import bt.edu.gcit.Alien;
import bt.edu.gcit.Desktop;
import bt.edu.gcit.Laptop;
import bt.edu.gcit.Computer;


@Configuration
@ComponentScan("bt.edu.gcit")
public class Appconfig {

    // @Bean(name = "comp")
    // // @Scope("prototype")
    // public Desktop desktop(){
    //     return new Desktop();
    // }
    
    // @Bean
    // public Alien alien(@Qualifier("comp") OR  @Autowired Computer comp){
    //     // return new Alien();

    //     Alien obj = new Alien();
    //     obj.setComp(comp);
    //     return obj;

    // }

    // @Bean
    // @Primary
    // public Laptop laptop(){
    //     return new Laptop();
    // }
}
