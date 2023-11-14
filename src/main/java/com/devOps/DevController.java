package com.devOps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {
	@GetMapping("msg")
	public String getMsg() {
		return "Sk";
	}
}
