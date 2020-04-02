import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//返回cookies信息的get接口开发

@SpringBootApplication
@ComponentScan("com.course.server")//指定要扫描哪个包下面的类
public class Application {



    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
