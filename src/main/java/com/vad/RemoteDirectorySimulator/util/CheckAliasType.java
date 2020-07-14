package com.vad.RemoteDirectorySimulator.util;

import java.util.Arrays;

public class CheckAliasType {

    String[] typeArry = { "phone", "email", "nationalid", "iban", "ussd", "bid" };// "custom"

    public CheckAliasType() {

        System.out.println("type list :: " + Arrays.asList(typeArry));
    }

    public boolean isAliasTypeExist(String aliasType) {

        boolean flag = false;

        System.out
                .println(Arrays.asList(typeArry).contains(aliasType.toLowerCase()) + " :: " + aliasType.toLowerCase());

        /*
         * if (Arrays.asList(typeArry).contains(aliasType.toLowerCase())) { flag = true;
         * }
         */

        for (String str : typeArry) {

            if (str.equalsIgnoreCase(aliasType)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

}
