package io.javabrains.springbootstarter;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class businessService {
	   ArrayList<Integer> arrlist = new ArrayList<Integer>(5); 
	   
       // use add() method to add elements in the list 
public void add(Integer x) { 
    arrlist.add(x); 
}
 
	
public String hello(String str) {
	arrlist.add(10);
	return str;
}
public String getArr() {
	return arrlist.toString();
}


public void adder(Integer hh) {
	arrlist.add(hh);
	
}
}
