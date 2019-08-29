package com.example.api.util;

import com.google.gson.Gson;

import java.io.Serializable;

public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    public static Result SUCCESS=new Result(CodeEnum.SUCCESS);
    public static Result FAIL=new Result(CodeEnum.FAIL);

    /**
     * 结果详细
     */
    private String msg;

    /**
     * 需要传回页面的数据
     */
    private Object data;

    /**
     * 状态码
     */
    private String code;

    /**
     * 加密
     */
    private boolean encrypt;

    /**
     * 图标
     */
    private Integer icon;

    public boolean isEncrypt() {
        return encrypt;
    }

    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result() {

    }

    public Result(CodeEnum enums) {
        this.msg = enums.getMsg();
        this.encrypt = enums.getEncrypt();
        this.code = enums.getCode();
        this.icon = enums.getIcon();
    }

    public Result(CodeEnum enums,Object data) {
        this.msg = enums.getMsg();
        this.encrypt = enums.getEncrypt();
        this.code = enums.getCode();
        this.icon=enums.getIcon();
        if(enums.getEncrypt()){
            this.data=DES.encode(new Gson().toJson(data));
        }else{
            this.data=data;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public static Result success(CodeEnum enums) {
        Result dto = new Result();
        dto.setMsg(enums.getMsg());
        dto.setEncrypt(enums.getEncrypt());
        dto.setCode(enums.getCode());
        dto.setIcon(enums.getIcon());
        return dto;
    }

    public static Result success(CodeEnum enums,Object data) {
        Result dto = new Result();
        dto.setMsg(enums.getMsg());
        dto.setData(data);
        dto.setEncrypt(enums.getEncrypt());
        dto.setCode(enums.getCode());
        dto.setIcon(enums.getIcon());
        if(enums.getEncrypt()){
            dto.setData(DES.encode(new Gson().toJson(data)));
        }else{
            dto.setData(data);
        }
        return dto;
    }
    public static Result fail(String code,String msg) {
        Result dto = new Result();
        dto.setMsg(msg);
        dto.setEncrypt(false);
        dto.setCode(code);
        dto.setIcon(SysCode.ICON.ICON_FAIL);
        return dto;
    }

    public static Result fail(String msg) {
        Result dto = new Result();
        dto.setMsg(msg);
        dto.setEncrypt(false);
        dto.setCode("1");
        dto.setIcon(SysCode.ICON.ICON_FAIL);
        return dto;
    }

    public static Result fail(String msg,Object data){
        Result dto = new Result();
        dto.setMsg(msg);
        dto.setEncrypt(false);
        dto.setData(data);
        dto.setCode("1");
        dto.setIcon(SysCode.ICON.ICON_FAIL);
        return dto;
    }

    public static Result success(String msg) {
        Result dto = new Result();
        dto.setMsg(msg);
        dto.setEncrypt(false);
        dto.setCode("0");
        dto.setIcon(SysCode.ICON.ICON_SUCCESS);
        return dto;
    }
}
