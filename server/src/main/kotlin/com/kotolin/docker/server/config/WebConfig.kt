package com.kotolin.docker.server.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.StringHttpMessageConverter
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import java.nio.charset.Charset

@Configuration
@EnableWebMvc
class WebConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**") // すべてのエンドポイントに対してCORSを設定
            .allowedOrigins("*") // すべてのオリジンからのアクセスを許可
            .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可するHTTPメソッド
            .allowedHeaders("*") // すべてのヘッダーを許可
    }
}