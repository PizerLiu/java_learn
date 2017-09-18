package com.techiekernel.rest;

import javax.ws.rs.*;

import com.common.ResponseUtils;
import com.common.commonVo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.techiekernel.service.FooBarService;

//@Component
public class FooBarWS {
	@Autowired
	private FooBarService fooBarService;
 
	@GET
	@Path("/ad")
	// 设置请求路径
	@Consumes("application/json")
	// 设置接收数据格式
	@Produces("application/json")
	public ResponseVo getMessage(@QueryParam("param") String msg) {

		return ResponseUtils.success(fooBarService.getMessage(msg));

	}

	public FooBarService getFooBarService() {
		return fooBarService;
	}

	public void setFooBarService(FooBarService fooBarService) {
		this.fooBarService = fooBarService;
	}

}
