package com.songyang.config;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConfig;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yang Song
 * @date 2022/9/25 22:13
 */
@Configuration
public class BootConfig {
    /**
     * @return DefaultAlipayClient方便后续调用Alipay接口
     */
    @Bean
    public DefaultAlipayClient getAliPayClient() throws AlipayApiException {
        AlipayConfig alipayConfig = new AlipayConfig();
        alipayConfig.setServerUrl(AlipayProperties.URL);
        alipayConfig.setAppId(AlipayProperties.APPID);
        alipayConfig.setPrivateKey(AlipayProperties.RSA_PRIVATE_KEY);
        alipayConfig.setFormat(AlipayProperties.FORMAT);
        alipayConfig.setCharset(AlipayProperties.CHARSET);
        alipayConfig.setAlipayPublicKey(AlipayProperties.ALIPAY_PUBLIC_KEY);
        alipayConfig.setSignType(AlipayProperties.SIGN_TYPE);
        return new DefaultAlipayClient(alipayConfig);
    }
}
