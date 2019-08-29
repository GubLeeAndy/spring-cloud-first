package com.example.api.util;

public class SysCode {
    /**MQ-start**/
    public interface QUEUEONE {
        public static final String QUEUE_ONE = "queue1";
        public static final String QUEUE_KEY1 = "queue_key_1";
    }

    public interface QUEUETWO {
        public static final String QUEUE_TWO = "queue2";
        public static final String QUEUE_KEY2 = "queue_key_2";
    }
    public static final String EXCHANGE = "queue_exchange";
    /**MQ-end**/

    /**图标**/
    public interface ICON{
        /**成功图标:1**/
        public static Integer ICON_SUCCESS = 1;
        /**失败图标:2**/
        public static Integer ICON_FAIL = 2;
        /**问题图标:3**/
        public static Integer ICON_PROBLEM = 3;
        /**锁:4**/
        public static Integer ICON_LOCK = 4;
    }

    /**用户类型**/
    public interface USER_TYPE{
        /**认证中心用户 0**/
        public static String CERT_USER="0";
        /**应用用户 1**/
        public static String APP_USER="1";
    }

    /**登陆状态**/
    public interface LOGIN{
        public static String LOCKED="1";
    }

    /**权限代码**/
    public interface PERMISS{
        /**1菜单**/
        public static String MENU = "1";
        /**2按钮**/
        public static String BTN = "2";
    }

    /**删除标识**/
    public interface IS_DEL{

        /**正常**/
        public static String NORMAL = "0";
        /**删除**/
        public static String DEL = "1";
    }

    /**
     *
     * @Description:TODO(字段是否可为空（默认0是，1否）)
     * @auther: xushaowen
     * @date: 2019/5/16 17:16
     *
     */
    public interface ZDZT{
        /**否**/
        public static String NO = "1";
        /**是**/
        public static String YES = "0";
    }

    /**
     * @ClassName: FILTER_TYPE
     * @Description: TODO(zuul 过滤器类型)
     * @author gangyu2
     * @date 2019年5月17日 上午11:43:35
     */
    public interface FILTER_TYPE {

        /**
         * 过滤器: 在请求被路由之前调用, 可用来实现身份验证、在集群中选择请求的微服务、记录调试信息等;
         */
        String PRE = "pre";

        /**
         * 过滤器: 在路由请求时候被调用;
         */
        String ROUTING = "route";

        /**
         * 过滤器: 在路由到微服务以后执行, 可用来为响应添加标准的HTTP Header、收集统计信息和指标、将响应从微服务发送给客户端等;
         */
        String POST = "post";

        /**
         * 过滤器: 在处理请求过程时发生错误时被调用。
         */
        String ERROR = "error";

    }

    /**
     * @ClassName: SHOULD_FILTER
     * @Description: TODO(是否使用过滤器)
     * @author gangyu2
     * @date 2019年6月19日 下午3:57:24
     */
    public interface SHOULD_FILTER{
        String IS_SUCCESS="isSuccess";
    }

    /**
     * token信息key
     */
    public static String TOKEN="userInfo";

    /**
     * @ClassName: SDLX
     * @Description: TODO(esb服务状态码)
     * @author gangyu2
     * @date 2019年6月20日 下午5:52:25
     */
    public interface ESB{

        /**响应时间头**/
        String RESPONSE_TIME="Response_Time";

        /**流量类型**/
        public interface LLXZ{
            /**不限制**/
            String bxz="1";
            /**日流量**/
            String rll="2";
        }

        /**授权类型**/
        public interface SQLX{
            /**授权启用**/
            String sqqy="1";

            /**授权关闭**/
            String sqgb="2";
        }

        /**服务类型**/
        public interface FWLX{

            /**服务启用**/
            String fwqy="1";

            /**服务关闭**/
            String fwgb="2";
        }

        /**资源类型**/
        public interface ZYLX{
            /**资源启用**/
            String zyqy="1";

            /**资源关闭**/
            String zygb="2";
        }

        /**日志类型**/
        public interface RZLX{

            /**普通日志**/
            String ptrz="0";

            /**非法日志**/
            String ffrz="1";

            /**异常日志**/
            String ycrz="2";

            /**错误日志**/
            String cwrz="3";
        }

        /**日志异常编码**/
        public interface RZBM{

            /**授权码无效**/
            String sqmwx="1001";

            /**未授权**/
            String wsq="1002";

            /**服务关闭**/
            String fwgb="1003";

            /**该账号已被禁用**/
            String zhjy="1004";

            /**授权未开始**/
            String sqwks="1005";

            /**访问来源受限**/
            String sqcq="1006";

            /**黑名单IP**/
            String ipsx="1007";

            /**入参异常**/
            String rcyc="1008";

            /**流量超限**/
            String llcx="2001";

            /**响应超时**/
            String xycs="2002";

            /**系统错误**/
            String xtcw="3001";

            /**出参配置错误**/
            String ccpzcw="3002";
        }


        /**接口响应类型**/
        public interface XYLX{
            /**XML**/
            String XML_UTF8="application/xml;charset=utf-8;";
            /**JSON**/
            String JSON_UTF8="application/json;charset=utf-8;";
        }

        /**黑名单限制类型**/
        public interface HMDXZLX{
            /**全部**/
            String all="1";

            /**自定义**/
            String customize="2";
        }

        /**黑名单IP类型**/
        public interface HMDIPLX{
            /**独立IP**/
            String ALONE_IP="1";

            /**范围IP**/
            String RANGE_IP="2";
        }

        /**接口类型**/
        public interface JKLX{
            /**HTTP**/
            public String HTTP="HTTP";
            /**WebService**/
            public String WEB_SERVICE="WebService";
        }

        /**字典类型**/
        public interface ZDLX{
            /**日志类型**/
            public String RZLX="rzlx";
            /**非法类型**/
            public String FFLX="fflx";
            /**异常类型**/
            public String YCLX="yclx";
            /**错误类型**/
            public String CWLX="cwlx";
            /**资源归属**/
            public String ZYGS="zygs";
            /**请求类型**/
            public String QQLX="qqlx";
            /**请求格式**/
            public String QQGS="qqgs";
            /**接口类型**/
            public String JKLX="jklx";
            /**IP范围类型**/
            public String IPFW="ipfw";
            /**响应格式**/
            public String XYGS="xygs";
            /**参数类型**/
            public String CSLX="cslx";

        }

        public interface XMLTYPE{
            //表示请求xml模板
            public Integer INXML = 1;

            //表示响应xml模板
            public Integer OUTXML = 2;
        }

        public interface XY{
            //标识 x轴
            public String X_VALUE = "xValue";

            //表示y 轴
            public String Y_VALUE = "yValue";
        }

        /**授权类型**/
        public interface AUTHSDLX{
            //无限制
            public String SDLX_NOT = "1";
            //日流量
            public String SDLX_DAY = "2";
        }

        /**参数是否为空**/
        public interface CSSFWK{
            //无限制
            public String WK = "1";
            //日流量
            public String BWK = "2";
        }

        /**服务状态**/
        public interface SERVERCODES{
            //开启提示
            public String CODES_OPEN = "1";
            //关闭提示
            public String CODES_CLOSE = "2";
        }

        /**消费者类型**/
        public interface XFZLX{
            /**消费者启用**/
            String xfzqy="1";

            /**消费者关闭**/
            String xfzgb="2";
        }

        /**EXCEL状态**/
        public interface EXCELZT{
            /**EXCEL启用**/
            String excelqy="启用中";

            /**EXCEL关闭**/
            String excelgb="已停用";
        }

        /**请求类型**/
        public interface QQLX{
            /**GET**/
            String GET="GET";

            /**POST**/
            String POST="POST";
        }
        /** 接口类型**/
        public interface JKLX_TITLE{

            /**Https接口**/
            String HTTPS="Http服务";

            /**WebService接口**/
            String WEBSERVICE="WebService服务";
        }
        /** 服务重试类型**/
        public interface CSBZ{

            /**Https接口**/
            String cs="1";

            /**WebService接口**/
            String bcs="2";
        }
        /** 日誌級別**/
        public interface RZJB{

            /**普通**/
            String PT="1";

            /**異常**/
            String YC="2";
        }
    }

}

