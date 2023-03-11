package com.mine.ts.controller;

import com.mine.ts.base.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

	@GetMapping
	public Result design() {
		Result<String> result = new Result<>();
		result.setResultSuccess("成功到了design页面", "设计你的卷饼");
		return result;
	}
}