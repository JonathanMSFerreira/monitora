package br.com.jonathan.monitora;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {


	@Autowired
	CarroRepository rep;
	

	@GetMapping("/")
	public ModelAndView painelPrincipal() {
		
		
		ModelAndView view = new ModelAndView("/home");
	
		return view;
		
		
		
		
	}
	
	
	@RequestMapping(value = "/localizacao", method = RequestMethod.POST)
	public void setMarcadores(@RequestBody Carro carro) {

		
		System.err.println(carro.toString());

		rep.save(carro);
		
	


	}

	
	@RequestMapping(value = "/marcadores", method = RequestMethod.POST)
	public ResponseEntity<List<Carro>> getMarcadores() {

	
		
	
	   return new ResponseEntity<List<Carro>>(rep.findAll(), HttpStatus.OK);


	}
	
	
}
