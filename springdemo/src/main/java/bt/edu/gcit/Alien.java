package bt.edu.gcit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;;

@Component 
@Scope("prototype")
public class Alien {

    @Value("32")
    private int age;
    private Laptop lap;

    @Value("3244444")
    private int salary;

    @Autowired
    @Qualifier("laptop")
    private Computer comp;
    

    // public int getAge(){
    //     return age;
    // }

    // public void setAge(int age){
    //     System.out.println("set alien called");
    //     this.age = age;
    // }

    // public Alien(){
    //     System.out.println("Alien Obj created");

    // }

    

    // public Laptop getLap(){
    //     return lap;
    // }

    // public void setLap(Laptop lap){
    //     System.out.println("from setlap");
    //     this.lap = lap;
    // }
    

   

    // public Alien(int age, Computer comp, int salary){
    //     System.out.println("Alien Obj created");
    //     // System.out.println(salary);

    //     this.age= age;
    //     this.comp = comp;
    //     this.salary = salary;

    // }

    public Alien(){
        System.out.println("Alien obj created");

    }

    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Computer getComp(){
        return comp;
    }
    
     

    public void code(){
        System.out.println("I am coding");
        // lap.compile();
        comp.compile();

    }
}
