package com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by John on 2019/5/6.
 */
public class StringUtils {
    public static List<String> DuplicateRemoval (String  arrStr) {
        String[] test1 = arrStr.split("#");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < test1.length; i++) {
            if (!list.contains(test1[i]))
                list.add(test1[i]);
        }
        return list;
    }
}
