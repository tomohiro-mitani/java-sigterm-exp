package hello;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/2")
    @ResponseBody
    public String index1() {
        System.out.println("2s response recevied");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interuption Exception");
        }
        System.out.println("5s response sent");
        return "2s Response!!!!!!!!!!";
    }

    @RequestMapping("/5")
    @ResponseBody
    public String index2() {
        System.out.println("5s response recevied");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Interuption Exception");
        }
        System.out.println("5s response sent");
        return "5s Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/10")
    @ResponseBody
    public String index3() {
        System.out.println("10s response snet");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interuption Exception");
        }
        System.out.println("Sending Response");
        System.out.println("10s response recevied");
        return "10s Response!!!!!!!!!!";
    }

    @RequestMapping("/20")
    @ResponseBody
    public String index6() {
        System.out.println("20s response snet");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("Interuption Exception");
        }
        System.out.println("20s response recevied");
        return "20 Seconds Response!!!!!!!!!!";
    }

    @RequestMapping("/loaderio-ab515cae3e3fdf5680e09e1e488ac69e.html")
    public String index5() {
        return "loaderio-ab515cae3e3fdf5680e09e1e488ac69e";
    }

}
