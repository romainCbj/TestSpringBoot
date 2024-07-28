package Api.springboot.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PremierTest {

	@GetMapping("/welcome")
	public String Welcome() {
		return "test api";
	}
}
