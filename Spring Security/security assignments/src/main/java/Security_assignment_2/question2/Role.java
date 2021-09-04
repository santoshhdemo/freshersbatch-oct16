import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Role{

	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User";
	}
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
}

