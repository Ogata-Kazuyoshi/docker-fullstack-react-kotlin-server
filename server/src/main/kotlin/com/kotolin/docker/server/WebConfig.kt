package com.kotolin.docker.server
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
//
//@EnableWebSecurity
//class SecurityConfig : WebSecurityConfigurerAdapter() {
//
//    @Throws(Exception::class)
//    override fun configure(http: HttpSecurity) {
//        http
//            // 他のセキュリティ設定があればここに追加
//            .cors().and()
//            .authorizeRequests()
//            .antMatchers("/**").permitAll()
//            .anyRequest().authenticated()
//            // 他のセキュリティ設定があればここに追加
//            .and()
//            .csrf().disable() // CSRF保護を無効化（APIサーバーの場合）
//        // 他のセキュリティ設定があればここに追加
//    }
//}