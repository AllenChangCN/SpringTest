import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {
    private child cld;

    public  static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        child cld = ctx.getBean("child",child.class);
        cld.gs.sayName();
        System.out.println();
    }
}

