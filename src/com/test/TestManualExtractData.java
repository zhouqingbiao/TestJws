package com.test;

import com.jws.Jws;
import com.jws.JwsService;

public class TestManualExtractData {

	public static void main(String[] args) {
		JwsService service = new JwsService();
		Jws jws = service.getJwsPort();
		long start = System.nanoTime();

		jws.manualExtractData("zhouqingbiao", 1);

		long end = System.nanoTime();

		System.out.println((end - start) + "纳秒");
		System.out.println((end - start) / 1000000 + "毫秒");
		System.out.println((end - start) / 1000000000 + "秒");

	}
}
