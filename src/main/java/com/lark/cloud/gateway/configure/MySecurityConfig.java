//package com.lark.cloud.gateway.configure;//package com.makelife.gateway.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
///**
// * @author sunyz
// * @desc
// * @create 2018-10-11 上午10:44
// */
//@Configuration
//@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
////@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
////@Order(SecurityProperties.IGNORED_ORDER)
//public class MySecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .mvcMatchers("/.well-known/jwks.json").permitAll()
//                .anyRequest().authenticated();
//    }
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        return new InMemoryUserDetailsManager(
//                User.withDefaultPasswordEncoder()
//                        .username("subject")
//                        .password("password")
//                        .roles("USER")
//                        .build());
//    }
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//}
