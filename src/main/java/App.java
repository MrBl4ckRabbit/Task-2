import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld newBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(newBean.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getMessage());
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getMessage());

        System.out.println("Is bean equals newBean: " + bean.equals(newBean));
        System.out.println("Is cat1 equals cat2: " + cat1.equals(cat2));
    }
}