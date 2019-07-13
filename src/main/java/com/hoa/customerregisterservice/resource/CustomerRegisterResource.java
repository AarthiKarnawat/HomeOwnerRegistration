package com.hoa.customerregisterservice.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.customerregisterservice.model.Response;

@RestController
@RequestMapping("/customer")
public class CustomerRegisterResource {
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public Response  registerCustomer()
	{
		Response response = new Response();
		response.setResult(true);
		return response;
	}

}
