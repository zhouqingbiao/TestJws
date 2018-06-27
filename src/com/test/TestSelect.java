package com.test;

import com.jws.Jws;
import com.jws.JwsService;

public class TestSelect {

    public static void main(String[] args) {
        JwsService service = new JwsService();
        Jws jws = service.getJwsPort();

        long start = System.nanoTime();

        // keys模糊查询关键字
        String arg0 = "*濮家东村*";

        // index
        // 0-->HZ_GIS.TPS_FW
        // 1-->HZ_FWDJ.TPF_JCDJB
        // 2-->HZ_GIS.TPS_ZRZ
        int arg1 = 0;

        // rows返回数据条数，-1取所有数据
        int arg2 = -1;

        String values = jws.getData(arg0, arg1, arg2);
        System.out.println(values);

        long end = System.nanoTime();

        System.out.println((end - start) + "纳秒");
        System.out.println((end - start) / 1000000 + "毫秒");
        System.out.println((end - start) / 1000000000 + "秒");
    }
}
