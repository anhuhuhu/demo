import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by apple on 15/7/26.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    //host:8080/hello/mvc
    @RequestMapping("/mvc")
    public String helloMvc(){
        return "home";
    }
}
