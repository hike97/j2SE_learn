package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author hike97 許せ　サスケ　これで最後だ
 * @create 2019-03-13 9:44
 * @desc 我的第一个webService
 **/
@WebService
public class MyFirstWebService {
	@WebMethod
	public String sayHello(String name){
		return "来啦"+name;
	}
}
