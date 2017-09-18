package com.techiekernel.service;

import com.techiekernel.vo.StudentVo;

import javax.jws.WebService;

@WebService
public interface FooBarService {
	public StudentVo getMessage(String msg);
}
