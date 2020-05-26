package com.jhzhang.address.normalizer;

import com.jhzhang.address.normalizer.util.Constant;
import org.junit.BeforeClass;
import org.junit.Test;

public class NormalizerTest {
    static Normalizer normalizer = null;


    @BeforeClass
    public static void setUp() {
        String dicPath = Constant.PATH + Constant.addressXml;
        String unkown = Constant.PATH + Constant.addressSuffixLevelDataXml;
        normalizer = new Normalizer(dicPath, unkown);
    }

    @Test
    public void normalizeAsStr() throws Exception {
        String address = "萧山区河庄街道御东湾8幢2单元401室";
        String nor = normalizer.normalizeAsStr(address);
        System.out.println(nor);
    }

}