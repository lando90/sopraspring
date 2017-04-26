package sopra.springentorno.mvc;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.*;
import org.springframework.ui.*;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hello")
public class HelloController{
	@RequestMapping(method=RequestMethod.GET)
	public String printHello(ModelMap modelo){
		modelo.addAttribute("mensaje","Spring MVC, bien");
		return "hello";
	}
}