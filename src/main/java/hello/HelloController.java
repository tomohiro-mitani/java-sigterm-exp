package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/5")
    public String index2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            return "Interruption Exception";
        }
        return "5 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/10")
    public String index3() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            return "Interruption Exception";
        }
        return "5 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/30")
    public String index4() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            return "Interruption Exception";
        }
        return "5 Seconds Response!!!!!!!!!!";
    }

}
