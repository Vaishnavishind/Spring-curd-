package com.pro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class mysecondproject {
	@GetMapping("name")
	public String display()
	{
		String str="hello i am vaishnavi shinde";
		return str;
	}
	@GetMapping("hello")
	public String show()
	{
		return "vaishnavi";
	}
}
