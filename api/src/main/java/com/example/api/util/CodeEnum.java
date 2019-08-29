package com.example.api.util;

public enum CodeEnum {
    //系统编码
    SYS_EXCEPTION("999",false,"系统异常",SysCode.ICON.ICON_FAIL),
    SUCCESS("0",false,"成功",SysCode.ICON.ICON_SUCCESS),
    ENCRYPT("0",true,"成功",SysCode.ICON.ICON_SUCCESS),
    FAIL("1",false,"失败",SysCode.ICON.ICON_FAIL),
    SIGN_FAIL("1",false,"签名不正确",SysCode.ICON.ICON_FAIL),
    DATA_EMPTY("0",false,"暂无数据",SysCode.ICON.ICON_SUCCESS),


    //token编码
    TOKEN_NOT_NULL("10000",false,"token不能为空",SysCode.ICON.ICON_FAIL),
    INVALID_TOKEN("10001",false,"无效的令牌",SysCode.ICON.ICON_FAIL),
    TOKEN_UNSUPPORTED_TYPE("10002",false,"无效的类型",SysCode.ICON.ICON_FAIL),
    TOKEN_READ_ERROR("10003",false,"令牌读取错误",SysCode.ICON.ICON_FAIL),
    TOKEN_EXPIRED("10004",false,"令牌过期",SysCode.ICON.ICON_FAIL),
    TOKEN_SUCCESS("10005",false,"获取令牌",SysCode.ICON.ICON_SUCCESS),

    //login
    USER_NOT_EXIST("11001",false,"用户不存在",SysCode.ICON.ICON_FAIL),
    VCODE_ERROR("11002",false,"验证码不正确",SysCode.ICON.ICON_FAIL),
    LOGIN_SUCCESS("11003",false,"登陆成功",SysCode.ICON.ICON_SUCCESS),
    LOGIN_FAIL("11004",false,"用户名或密码不正确",SysCode.ICON.ICON_FAIL),
    USER_LOCKED("11005",false,"账户已锁定",SysCode.ICON.ICON_LOCK),
    LOGIN_EXCEPTION("11006",false,"登陆异常",SysCode.ICON.ICON_FAIL),
    NOT_PERMISSION("11007",false,"没有权限",SysCode.ICON.ICON_LOCK),
    KICKOUT("11008",false,"改账户在其他地方登录，请重新登录！",SysCode.ICON.ICON_LOCK),
    SYSTEM_NOT_EXIST("11009",false,"系统不存在！",SysCode.ICON.ICON_FAIL),
    SYSUSER_NOT_LOGIN_APP("11010",false,"系统用户不能登陆应用系统！",SysCode.ICON.ICON_FAIL),

    OUT_IN_FAIL("20000",false,"检测到引用资源发生变化，请重新编辑进行确认！",SysCode.ICON.ICON_FAIL),
    ;




    private String code;

    private String msg;

    private Boolean encrypt;

    private Integer icon;

    CodeEnum(String code,Boolean encrypt, String msg,Integer icon) {
        this.code = code;
        this.encrypt = encrypt;
        this.msg = msg;
        this.icon = icon;
    }

    public Integer getIcon() {
        return icon;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Boolean getEncrypt() {
        return encrypt;
    }

}
