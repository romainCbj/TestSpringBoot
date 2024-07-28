package Api.springboot.app;
import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PremierTest {

	@GetMapping("/welcome")
	public String Welcome() {
		return "test api 2";
	}
	
	@GetMapping("/testApi")
	public Map<String, String> TestJson(){
		 HashMap<String, String> map = new HashMap<>();
		    map.put("key", "value");
		    map.put("foo", "bar");
		    map.put("aa", "bb");
		    return map;
	}
	
	@GetMapping(path = "/testResponse")
    public ResponseEntity<Object> sayHello()
    {

		HashMap<String, String> map = new HashMap<>();
        map.put("aa", "bb");
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
