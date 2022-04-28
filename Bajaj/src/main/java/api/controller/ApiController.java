package api.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api.pojo.Response;

@RestController
public class ApiController
{
	@PostMapping("/bfhl")
	@ResponseBody
	public void insert(@RequestParam String[] data)
	{
		List<String> number=new ArrayList<String>();
		List<String> alphabet=new ArrayList<String>();
		Response obj = new Response();
		obj.setStatus(true);
		obj.setUser_id(100);
		obj.setEmail_id("pratik123@gmail.com");
		obj.setNumbers(null);
		obj.setAlphabate(null);
		obj.setCollege_roll_number(1);
		for(int i=0;i<data.length;i++)
		{
			if(((String) data[i]).charAt(0)>='A' && ((String) data[i]).charAt(0)<='Z')
			{
				alphabet.add((String) data[i]);
			}
			else
			{
				number.add((String) data[i]);
			}
		}
		
	}
}
