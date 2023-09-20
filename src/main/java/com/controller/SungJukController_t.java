package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.SungJukDTO;

@Controller
@RequestMapping(value="sungJuk")
public class SungJukController_t {
	
	@GetMapping(value="input.do")//@RequestMapping(value="sungJuk")써줘서  /sungJuk/input.do 이거 없애도된다.
	public String input() {
		return "/sungJuk/input_t";
	}
	
	@PostMapping(value="result.do") // /sungJuk/result.do
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		int tot = sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath();
		double avg = tot/3.;
		
		sungJukDTO.setTot(tot);
		sungJukDTO.setAvg(avg);
		
		model.addAttribute("sungJukDTO",sungJukDTO);
		
		return "/sungJuk/result_t";
	}
}
