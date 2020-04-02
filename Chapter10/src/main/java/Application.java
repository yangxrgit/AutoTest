import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.course.server")
public class Application {
    //返回cookies信息的get接口开发


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
