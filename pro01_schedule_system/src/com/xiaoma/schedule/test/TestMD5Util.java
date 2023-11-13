package com.xiaoma.schedule.test;

import com.xiaoma.schedule.util.MD5Util;
import org.junit.jupiter.api.Test;

/**
 * ClassName: TestMD5Util
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/11/8 17:21
 * @Version 1.0
 */
public class TestMD5Util {
    @Test
    public void testEncrypt(){
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
