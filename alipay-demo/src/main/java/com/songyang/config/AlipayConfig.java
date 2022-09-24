package com.songyang.config;

/**
 * @author Yang Song
 * @date 2022/9/23 11:08
 */
public class AlipayConfig {
    /**
     * 商户appid
     */
    public static String APPID = "2021000117686193";
    /**
     * 应用私钥
     */
    public static String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCFFpWW5tCKOyBz5x7utoFUK1aodnBKj/2jqXIjtW6ekiDZ2+LQ3Qfz5k7hSCmxgfEqRq2lmrdQsEpBu267evfLMFs7pGGcEoeEKuhb0gFFGK0BLi1KkZnyJN0ii2iS0Va0yB7QMSV59xkP12qp3nCFLi0zHWhF3JmBZpDJ0vzLUuZrUyBUJ/4kiSHv0itB1/GWSQZqZ2uM4VBEYiPKXt0k+WYRiWlvaOcfIIAUF+TfbxKm4ZIDVJoyysUh/C2/OlMjj+5wVBVtuB0e139IGIxhm9zykB+mpe06QMdkJIBiQ+ehv0UpY9SUvg+wCpdl4FEg/VG5zrJEqS0NTDWGR6d7AgMBAAECggEATtZQCrHz+s6HrODOPA40kk2R6f0vC5w8XcS0bl69hoV9nFBbDerBGUPmmiELQbF90NNJbf42dT/Y3RNQxxJS0zRz9uKrR67aQ/q+5hWC1xGE+lwGTFPv47ben+YBLmd/e1vIlP9n+dXcLLwo3TN9aAcwk0TqTegdrr+5KTUotrAr8srYBs5okaijVmPK8RHWslpw96EQWAgyYSJkPL4NmHa0CTuCGABLqn82f8+m2MD8zqF9YKrf6NRnVxK8EXqEv93nl0oPJGNY/GguRZxoeDhQIr8u1YiTZxrp2dGs8HHoC2sDdkyQShwLF3tJ1Wyb7UsbyLJ2f+hFKpVxWX5hMQKBgQDDQpgk1biR+6yJxWTK7u8kCKg1MQaOMy5IseW8bVXfv0+KdzHFVU1cokmfcKRoWcgpgPUr5ggpLqO4yoiE2WNQnymIM5h6eQbgwMLog5EDyOKcToHWNz74cuflhY3lMI/XAGusNWrDdNLiaw0eDX9dFXIp6k4SJXHBCizGkkRuRwKBgQCufPkAhV6VxMD4qJEbqMzfF7Cl2NbPBUN+Gcs4xkbQl7zmCQx8GtSTjlkG+GxH/XF8yBYFe2Vqny4aVoPSOpWsSfU4WNAwhcLwUycZ2TsRFER0JdIp6QDK67td8OxdiZ/2beXj/IFxuaq0OsDguXFCKR5KlvLvQ1j+FM3t9ucTLQKBgB5kijwJjD4k13lmYUb5I/4O3ufQpr2Rl9222xSWTCyUobPi07tsiKsnk6Aer2iSuQZEzWS03IZUfSVxWQicscnFzHgn188QcZKgTnZUrEjThvpfefQ3CzUu5YujWy/WfD0yEpBujBy6XWziztrjrPR3NxrxHo/Shj9O7yNFdyNXAoGAUpKlq49x8WJJB+ONuA8r1K97UyDIlvOguv4t49JBFNmZ9Sp3FAwGaUXF77yEUZUorapqcXGxzsFBqgkjHMvIpN3jBCVTcIL8e4p+SIc6opx6wJRdXqP7Ugw4gP5QfPtyDcZ4Mmn+P/ljRSNAv5hCdtLKmPXSRVQTuznRMjnTpIkCgYA+S7kDnu72v1oXlGq9A6417eShs62KoOZwco2jIh+kZjx6RyUK3HFYDMKZANCaopiDwDe2FxV2N+YH/ABz37lrFEWkM3XwdRtTg/igTPMUv3sB7W0Gm4xOYWhzNsuo0hq+Z2J3I5f02efc8BipNzFsbEBkXWOOv0Hqh21KVWI/Qw==";
    /**
     * 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String notify_url = "http://songyang.top/aliNotify";
    /**
     * 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数， 商户可以自定义同步跳转地址
     */
    public static String return_url = "http://localhost:8080/aliReturn";
    /**
     * 请求网关地址
     */
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    /**
     * 编码
     */
    public static String CHARSET = "UTF-8";
    /**
     * 格式
     */
    public static String FORMAT = "json";
    /**
     * 支付宝公钥
     */
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqdCjBCXKDqcyqLfW9bFMhC95d9pmU4AUPrPx+v++zPlkeS8CGYyV3ZdJEXiySDPkIL4x7G4iL7ycHey36t8s/rlkk+NbMlad0IR2gX6QPo03hZswOBlHSJAIEm6ccTcXfGyJBSyE0HCHnUGaKb1ZA7AY+XPE46lCxzB1crrdg/FLbp93jH2+90jVv4epenIAx1/8oo1qSI5ahmyygJGFzAz709ouidiCJ8du7qwGz8jEIRiCVfA1+YuaiPo2Bgts5jyLtHerqYN2nUPJ+Nuvk9WX3KrLgAmdQHXyu/16mA/zm2mxSnf2v4dIKGZEzMndKyHcv1QQN7K6YXxZPlywMQIDAQAB";
    /**
     * RSA2
     */
    public static String SIGN_TYPE = "RSA2";
}
