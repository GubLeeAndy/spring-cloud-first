package com.example.api.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.util.Map;
import com.google.gson.Gson;

public class DES {
    // 密钥
    private final static String secretKey = "com.jxkj.tek@2018JX95018";
    // 向量
    private final static String iv = "jxkj@tek";
    // 加解密统一使用的编码方式
    private final static String encoding = "utf-8";

    /**
     * @Title: encode
     * @Description: TODO(加密)
     * @param String
     * @author gangyu2
     * @date 2018年11月20日下午1:19:19
     */
    public static String encode(String plainText){
        Key deskey = null;
        DESedeKeySpec spec;
        try {
            spec = new DESedeKeySpec(secretKey.getBytes());
            SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
            deskey = keyfactory.generateSecret(spec);

            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
            IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
            byte[] encryptData = cipher.doFinal(plainText.getBytes(encoding));
            return Base64.encode(encryptData);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * @Title: decode
     * @Description: TODO(解密)
     * @param String
     * @author gangyu2
     * @date 2018年11月20日下午1:19:37
     */
    public static String decode(String encryptText){
        try{

            Key deskey = null;
            DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
            SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
            deskey = keyfactory.generateSecret(spec);
            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
            IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, deskey, ips);

            byte[] decryptData = cipher.doFinal(Base64.decode(encryptText));

            return new String(decryptData, encoding);
        }catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String e = encode("测试");
        System.out.println(e);
        Map<String,Object> map=new Gson().fromJson(decode("JPjt08K1/ulwjwTQTyTcmQ=="), Map.class);
        System.out.println(map.get("msg"));
    }

}
