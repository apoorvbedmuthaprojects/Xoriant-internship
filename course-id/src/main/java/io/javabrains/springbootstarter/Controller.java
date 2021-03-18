package io.javabrains.springbootstarter;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.
annotation.Autowired;
class op{
	Integer a;

	op(op k){
		a=k.a;
	}
	op(){}
}
@RestController
public class Controller {
	@Autowired
	public businessService BusiServ;
	@RequestMapping("/{str}")
public String sayHi(@PathVariable String str){
	return BusiServ.hello(str);
}
	@RequestMapping("/arrlist")
	public String get(){
		return BusiServ.getArr();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public Integer adder(@RequestBody op hh){
		BusiServ.adder(hh.a);
		return hh.a;
	}
}
