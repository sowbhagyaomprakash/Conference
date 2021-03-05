package Controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

public class GreetingController {
    
    @GetMapping("greeting")
    public String Greeting(Map<String,Object> model){
              model.put("message","Hello sowbhagya");
              return "greeting";
    }
}
