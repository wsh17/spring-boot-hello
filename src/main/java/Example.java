import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello Metapod V2.0 2016 ....  Welcome to OpenStack Austin Team!!! ";
    }

public static void main(String[] args) throws Exception {
     SpringApplication.run(Example.class, args);
    }

}
