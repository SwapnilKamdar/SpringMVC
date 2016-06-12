package mvc.poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
 
	@RequestMapping("/welcome/countryName/{userName}")
	protected ModelAndView helloWorld(@PathVariable("userName") String name) {
 
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi "+name+", welcome to the first Spring MVC Application");
		
		return modelandview;
	}
}