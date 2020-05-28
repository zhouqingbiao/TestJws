package com.test;

import com.jws.Jws;
import com.jws.JwsService;

public class TestManualExtractData {

    public static void main(String[] args) {
        JwsService jwsService = new JwsService();
        Jws jws = jwsService.getJwsPort();
        long start = System.nanoTime();

        // 0-->HZ_GIS.TPS_FW
        // 1-->HZ_FWDJ.TPF_JCDJB
        // 2-->HZ_GIS.TPS_ZRZ
        jws.manualExtractData("zhouqingbiao", 2);

        long end = System.nanoTime();

        System.out.println((end - start) + "纳秒");
        System.out.println((end - start) / 1000000 + "毫秒");
        System.out.println((end - start) / 1000000000 + "秒");

    }
}
