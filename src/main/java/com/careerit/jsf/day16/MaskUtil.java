package com.careerit.jsf.day16;

public final class MaskUtil {

        private MaskUtil(){}

        public static String maskAccNumber(String accNumber){
                String lastFour = accNumber.substring(accNumber.length()-4);
                return "XXXXXX"+lastFour;
        }

}
