package configuration;

import java.util.concurrent.atomic.AtomicLong;

import models.Greeting;
import services.NewGreeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Endpoints {

    @RequestMapping(value="/hello-world" , method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return NewGreeting.newGreeting(name);
    }

    @RequestMapping(value="/hello-world2" , method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello2(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return NewGreeting.newGreeting(name);
    }


}