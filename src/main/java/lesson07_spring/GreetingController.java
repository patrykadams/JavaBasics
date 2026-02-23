package main.java.lesson07_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/api/greet")
    public Map<String, String> sayHello(@RequestParam(defaultValue = "Guest") String name) {
        // Returning a Map automatically converts it to JSON format for the browser
        return Map.of(
            "message", "Hello, " + name + "!",
            "status", "Online",
            "framework", "Spring Boot"
        );
    }
}