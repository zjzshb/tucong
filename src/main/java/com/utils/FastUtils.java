package com.utils;


import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


/**
 * Created by John on 2019/4/21.
 */
public class FastUtils {
    public static String[] upLoadFile(File file) throws Exception{
        //加载连接信息（即FastDFS中tracker服务器IP）
        ClientGlobal.init("F:\\workspce\\tucong\\src\\main\\resources\\fdfs_client.conf");
        //返回储存路径:group1 M00/00/00/wKhuW1Vmj6KAZ09pAAC9przUxEk788.jpg
        //http://119.23.191.210:8888/group1/M00/00/00/rBA6VVy8S7WASh8SAAUTZ_gYT6I063.jpg
        String[] files =  uploadFile(file, file.getName(), file.length());
        System.out.println(Arrays.asList(files));
        return files;
    }
    /**
     * 上传文件
     */
    public static String[] uploadFile(File file, String uploadFileName, long fileLength) throws IOException {
        System.out.println("上传文件=======================");
        byte[] fileBuff = getFileBuffer(new FileInputStream(file), fileLength);
        String[] files = null;
        String fileExtName = "";
        if (uploadFileName.contains(".")) {
            fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);
        } else {
            System.out.println("Fail to upload file, because the format of filename is illegal.");
            return null;
        }

        // 建立连接
        TrackerClient tracker = new TrackerClient();
        TrackerServer trackerServer = tracker.getConnection();
        StorageServer storageServer = null;
        StorageClient client = new StorageClient(trackerServer, storageServer);

        // 设置元信息
        NameValuePair[] metaList = new NameValuePair[3];
        metaList[0] = new NameValuePair("fileName", uploadFileName);
        metaList[1] = new NameValuePair("fileExtName", fileExtName);
        metaList[2] = new NameValuePair("fileLength", String.valueOf(fileLength));

        // 上传文件
        try {
            files = client.upload_file(fileBuff, fileExtName, metaList);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Upload file \"" + uploadFileName + "\"fails");
        }
        trackerServer.close();
        return files;
    }
    private static byte[] getFileBuffer(InputStream inStream, long fileLength) throws IOException {

        byte[] buffer = new byte[256 * 1024];
        byte[] fileBuffer = new byte[(int) fileLength];

        int count = 0;
        int length = 0;

        while ((length = inStream.read(buffer)) != -1) {
            for (int i = 0; i < length; ++i) {
                fileBuffer[count + i] = buffer[i];
            }
            count += length;
        }
        return fileBuffer;
    }


}
