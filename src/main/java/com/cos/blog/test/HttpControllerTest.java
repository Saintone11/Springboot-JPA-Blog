package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = new Member(1,"ssar","1234","email");
		System.out.println(TAG+"getter :"+ m.getId());
		m.setId(5000);
		System.out.println(TAG+"setter :" + m.getId());
		return " test 완료";
	}
	private static final String TAG = "HttpController Test : ";
	@GetMapping("/http/get")
	public String getTest(Member m) {
			return "get 요청"+m.getId() +"," + m.getUsername() + "," + m.getPassword();
	}
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) {
		return m.getId() +"," + m.getUsername() + "," + m.getPassword();
}
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return m.getId() +"," + m.getUsername() + "," + m.getPassword();
}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		return "test";
	}
}
