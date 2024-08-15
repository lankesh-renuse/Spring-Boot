package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	
    @GetMapping("/ok")
    public String ok() {
        return "ok";
    }

}
