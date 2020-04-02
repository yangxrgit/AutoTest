package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//官方QuickStart的例子，直接运行这个类的main方法就可以启动springboot，然后浏览器访问localhost：8080，可以看到返回hello world

//表明托管到springboot
@Controller
@EnableAutoConfiguration
public class SampleController {

    //访问localhost：8080/根目录返回"Hello World！"
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);//启动入口类
    }
}

