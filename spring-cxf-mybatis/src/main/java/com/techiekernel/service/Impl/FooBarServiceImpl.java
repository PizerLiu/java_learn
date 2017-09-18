package com.techiekernel.service.Impl;

import com.techiekernel.dao.FooBarDao;
import com.techiekernel.service.FooBarService;
import com.techiekernel.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService
public class FooBarServiceImpl implements FooBarService {

	@Autowired
	private FooBarDao fooBarDao;

	public StudentVo getMessage(String msg) {
		Long aa = fooBarDao.getAccount();
		StudentVo a = new StudentVo();
		a.setName("刘翀"+msg);
		a.setAgo(24L);
		a.setSex(1L);
		a.setAccount(aa);

 		return a;
 	}
}
