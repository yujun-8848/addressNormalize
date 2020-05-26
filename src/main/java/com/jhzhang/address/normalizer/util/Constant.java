package com.jhzhang.address.normalizer.util;


public class Constant {
    public static final String SEPARATOR = "/";
    public static final String PATH = Constant.class.getClassLoader().getResource("conf").getPath() + SEPARATOR;

    public static String addressXml = "address.xml";
    public static String addressModelXml = "addressModel.Xml";
    public static String addressSuffixLevelDataXml = "addressSuffixLevelData.Xml";



    public static void main(String[] args) {
        System.out.println(PATH  + addressXml);
    }

}
