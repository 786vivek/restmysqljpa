package com.example.demo.vvkpackage;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class Homecontroller {

	@Autowired
Userrepo service;	
	
@RequestMapping(value="/all", method = RequestMethod.GET)
public @ResponseBody Iterable<Usermodel>  all(){
	return service.findAll();
}
//this is for localhost:8080/user/find/1
@RequestMapping(value="/find/{id}", method = RequestMethod.GET)
public Optional<Usermodel> sss(@PathVariable int id){
	

	
	return service.findById(id);
}


  //for form parameter pass through html query
  //like(http://localhost:8080/user/find?id=1)
  
	/*
	 * @RequestMapping(value="/find", method = RequestMethod.GET) public Usermodel
	 * sss1(@RequestParam int id){ Usermodel use=service.findone(id); if(use==null)
	 * {
	 * 
	 * throw new Usernotfoundexception("id"+id); } System.out.print("yahooo");
	 * return service.findone(id); }
	 */
  
  @RequestMapping(value="/save", method = RequestMethod.POST,consumes= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
  public Usermodel ssa1(@RequestBody Usermodel usermodel){ return service.save(usermodel); }
  
  
	/*
	 * @RequestMapping(value="/save1", method = RequestMethod.POST,consumes=
	 * {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}) public
	 * Usermodel ssa12(@RequestParam int id,@RequestParam String name,@RequestParam
	 * String email){ System.out.print("yahooohooo save ");
	 * 
	 * Usermodel usermodel=new Usermodel(); usermodel.setId(id);
	 * usermodel.setName(name); usermodel.setName(name); return
	 * service.save(usermodel); }
	 */
 
}
