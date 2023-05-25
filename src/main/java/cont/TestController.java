package cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	@GetMapping("/test2")
	public String test1() {
		return "test2";
	}

	public TestController() {
		// TODO Auto-generated constructor stub
	}

}
