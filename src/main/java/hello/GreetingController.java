package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HTTP requests are handled by a controller. 
 * This controller will handle GET requests for /greeting by returing the name of a View (greeting).
 * A View is responsible for rendering the HTML content.
 */
@Controller
public class GreetingController {

	/**
	 * @RequestMapping - ensures that HTTP requests to /greeting are mapped to greeting() method;
	 * @RequestParam - binds the value of the query String parameter name into the name parameter of the greeting() method;
	 */
    @RequestMapping("/greeting") //ensures that HTTP requests to /greeting are mapped to greeting() method
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}