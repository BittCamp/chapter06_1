package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.SungJukDTO;

@Controller
public class SungJukController {

	@GetMapping(value="/input.to")
	public String input() {
		return "/sungJuk/input";
	}
	
	//@PostMapping(value="/result.to",method=RequestMethod.GET, produces= "text/html; charset=UTF-8")
	@RequestMapping(value="/result.to" ,method=RequestMethod.POST, produces= "text/html; charset=UTF-8")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		model.addAttribute("name", sungJukDTO.getName());
		model.addAttribute("kor", sungJukDTO.getKor());
		model.addAttribute("eng", sungJukDTO.getEng());
		model.addAttribute("math", sungJukDTO.getMath());
		
		sungJukDTO.setTot(sungJukDTO.getKor()
						  +sungJukDTO.getEng
						  ()+sungJukDTO.getMath());
		sungJukDTO.setAvg(sungJukDTO.getTot()/3);
		
		model.addAttribute("tot", sungJukDTO.getTot());
		model.addAttribute("avg", sungJukDTO.getAvg());
		return "/sungJuk/result";
	}
}
