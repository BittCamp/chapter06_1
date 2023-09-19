package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.bean.SumDTO;

@Controller
public class SumController {
	
	//@RequestMapping(value="/input.do", method=RequestMethod.GET)
	@GetMapping(value="/input.do")
	public String input() {
		return "/sum/input";
	}
	
//	@GetMapping(value="/result.do")
//	public String result() {
//		return "/sum/result";
//	}
//	
//	@GetMapping(value="/result.do")
//	public ModelAndView result(@RequestParam int x, @RequestParam int y) { //@RequestParam int x 스프링웹에서 파라메터보낼때 쓴다.
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",x);
//		mav.addObject("y",y);
//		mav.setViewName("/sum/result");
//		return mav;
//	}
//	@GetMapping(value="/result.do") //int 로 넘기면 공백이면 오류나기때문에.
//	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") String x, 
//							   @RequestParam(required = false, defaultValue = "0") String y) { 
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",x);
//		mav.addObject("y",y);
//		mav.setViewName("/sum/result");
//		return mav;
//	}
//	@GetMapping(value="/result.do") //int 로 넘기면 공백이면 오류나기때문에. //DTO보다 Map으로 많이써요~
//	public ModelAndView result(@RequestParam Map<String,String> map) { 
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x",map.get("x"));
//		mav.addObject("y",map.get("y"));
//		mav.setViewName("/sum/result");
//		return mav;
//	}
//	@GetMapping(value="/result.do") 
//	public String result(@RequestParam Map<String,String> map, ModelMap modelMap) { 
//		modelMap.put("x", map.get("x"));
//		modelMap.put("y", map.get("y"));
//		return "/sum/result";
//	}
	
	@GetMapping(value="/result.do") 
	public String result(@ModelAttribute SumDTO sumDTO, Model model) {//, ModelMap modelMap //@ModelAttribute로 받을때는 모델어트리뷰트로 받아야되.. 객체라서 그렇다. 
		model.addAttribute("x", sumDTO.getX());//modelMap.put("x", sumDTO.getX());
		model.addAttribute("y", sumDTO.getY());//modelMap.put("y", sumDTO.getY());
		return "/sum/result";
	}
}
