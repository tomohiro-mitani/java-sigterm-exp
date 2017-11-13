package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            return "Interruption Exception";
        }
        return "Greetings from Spring Boot!";
    }
    
}
