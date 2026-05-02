package manoj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler4 {
	
	@RequestMapping("/a")
	public String hello1()
	{
		return "local host1";
	}
	
	@RequestMapping("/b")
	public String hello2()
	{
		return "local host2";
	}
	
	@RequestMapping("/c")
	public String hello3()
	{
		return "local host3";
	}
	
	@RequestMapping("/d")
	public String hello4()
	{
		return "local host4";
	}
	
	@RequestMapping("/e")
	public String hello5()
	{
		return "local host5";
	}
}