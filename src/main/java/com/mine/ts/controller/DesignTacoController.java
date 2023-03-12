package com.mine.ts.controller;

import com.mine.ts.base.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {



	@GetMapping
	public Result design() {
		// 查出所有配料，展示给用户

		Result<String> result = new Result<>();
		result.setResultSuccess("成功到了design页面", "属于你的卷饼，朋友");
//		modelAndView.addObject("result", result); // 不需要这样，直接返回一个result，前端就可以拿到
		return result;
	}
}