package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/2")
    public String index1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return "Interruption Exception for 2s res";
        }
        return "2 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/5")
    public String index2() {
        try {
            System.out.println("Sleeping 5s starts");
            Thread.sleep(5000);
            System.out.println("Awake after 5s");
        } catch (InterruptedException e) {
            return "Interruption Exception for 5s res";
        }
        System.out.println("Sending Response for 5s");
        return "5 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/10")
    public String index3() {
        try {
            System.out.println("Sleeping 10s starts");
            Thread.sleep(10000);
            System.out.println("Awake after 10s");
        } catch (InterruptedException e) {
            return "Interruption Exception for 10s res";
        }
        System.out.println("Sending Response for 10s");
        return "10 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/20")
    public String index6() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            return "Interruption Exception for 20s res";
        }
        return "20 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/30")
    public String index4() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            return "Interruption Exception for 30s res";
        }
        return "30 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/loaderio-ab515cae3e3fdf5680e09e1e488ac69e.html")
    public String index5() {
        return "loaderio-ab515cae3e3fdf5680e09e1e488ac69e";
    }

}
