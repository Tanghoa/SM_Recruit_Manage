package com.recruit.until;


import com.recruit.until.constant.CrowdConstant;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CrowdUtil {

    public static String md5(String source) {

        if (source == null || source.length() == 0) {
            throw new RuntimeException(CrowdConstant.MESSAGE_STRING_INVALIDATE);
        }

        try {
            // 3.获取 MessageDigest 对象
            String algorithm = "md5";

            MessageDigest instance = MessageDigest.getInstance(algorithm);

            byte[] input = source.getBytes();

            byte[] output = instance.digest(input);

            // 6.创建 BigInteger 对象
            int signum = 1;
            BigInteger integer = new BigInteger(signum, output);

            // 7.按照 16 进制将 bigInteger 的值转换为字符串
            int radix = 16;
            String s = integer.toString(radix).toUpperCase();
            return s;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        return null;

    }

    /*** 判断当前请求是否为 Ajax 请求 * @param request * @return */
    public static boolean judgeRequestType(HttpServletRequest request) {
        // 1.获取请求消息头信息
        String acceptInformation = request.getHeader("Accept");
        String xRequestInformation = request.getHeader("X-Requested-With");
        // 2.检查并返回
        return( acceptInformation != null
                && acceptInformation.length() > 0
                && acceptInformation.contains("application/json") )

                || ( xRequestInformation != null
                && xRequestInformation.length() > 0
                && xRequestInformation.equals("XMLHttpRequest") );
    }

    }
