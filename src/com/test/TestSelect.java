package com.test;

import com.jws.Jws;
import com.jws.JwsService;

public class TestSelect {

	public static void main(String[] args) {
		JwsService service = new JwsService();
		Jws jws = service.getJwsPort();

		long start = System.nanoTime();

		String arg0 = "*濮家新村*";
		String values = jws.selectHzGisTpsZrz(arg0);
		System.out.println(values);

		long end = System.nanoTime();

		System.out.println((end - start) + "纳秒");
		System.out.println((end - start) / 1000000 + "毫秒");
		System.out.println((end - start) / 1000000000 + "秒");
	}
}
