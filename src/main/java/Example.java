import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping(value = "/")
    String home() {
        return "Hello Metapod 2016 ....Welcome to OpenStack Austin Team Metapod 6.0 !!! ";
    }

public static void main(String[] args) throws Exception {
     SpringApplication.run(Example.class, args);
    }

}
