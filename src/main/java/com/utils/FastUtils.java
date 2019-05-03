package com.utils;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.DFSUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by John on 2019/4/21.
 */
public class FastUtils {
    public static String[] upLoadFile(File file, String uploadFileName, long fileLength){
        //加载配置文件的方式
        String configFileName = "src/test/resources/fdfs_client.conf";
        String[] re = null;
        try {
            ClientGlobal.init(configFileName);
        }catch(Exception e){
            e.printStackTrace();
        }

        //返回储存路径:group1 M00/00/00/wKhuW1Vmj6KAZ09pAAC9przUxEk788.jpg
        //http://119.23.191.210:8888/group1/M00/00/00/rBA6VVywBv-AF58_AAUTZ_gYT6I217.jpg
        String[] files = new String[0];
        try {
            re = files = DFSUtils.uploadFile(file, uploadFileName, fileLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  re;

    }
}
