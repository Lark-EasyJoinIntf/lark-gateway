package com.lark.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.http.codec.support.DefaultServerCodecConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients(basePackages = {"com.lark.cloud.user.client"})
public class LarkGatewayApplication{

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/login").setViewName("login");
//		registry.addViewController("/oauth/confirm_access").setViewName("authorize");
//	}



//	@Bean
//	public ServerCodecConfigurer getServerCodecConfigurer(){
//		return new DefaultServerCodecConfigurer();
//	}


//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		//@formatter:off
//		return builder.routes()
//
////				//filter 方式一
////				.route("baidu",r->r.path("/baidu")
////						.uri("https://www.baidu.com/")
////						.filters(new AuthorizeGatewayFilter()))
//
////				.route("user",r->r.path("/user")
////						.uri("http://106.12.124.234:8111/user/1"))
//
//
//				.route("baidu",r->r.path("/baidu")
//						.uri("https://www.baidu.com"))
//
//				.route("path_route", r -> r.path("/get")
//						.uri("http://httpbin.org"))
//				.route("host_route", r -> r.host("*.myhost.org")
//						.uri("http://httpbin.org"))
//				.route("rewrite_route", r -> r.host("*.rewrite.org")
//						.filters(f -> f.rewritePath("/foo/(?<segment>.*)",
//								"/${segment}"))
//						.uri("http://httpbin.org"))
//				.route("hystrix_route", r -> r.host("*.hystrix.org")
//						.filters(f -> f.hystrix(c -> c.setName("slowcmd")))
//						.uri("http://httpbin.org"))
//				.route("hystrix_fallback_route", r -> r.host("*.hystrixfallback.org")
//						.filters(f -> f.hystrix(c -> c.setName("slowcmd").setFallbackUri("forward:/hystrixfallback")))
//						.uri("http://httpbin.org"))
////				.route("limit_route", r -> r
////						.host("*.limited.org").and().path("/anything/**")
////						.filters(f -> f.requestRateLimiter(c -> c.setRateLimiter(redisRateLimiter())))
////						.uri("http://httpbin.org"))
//				.route("websocket_route", r -> r.path("/echo")
//						.uri("ws://localhost:9000"))
//
//				.build();
//		//@formatter:on
//	}

//	@Bean
//	RedisRateLimiter redisRateLimiter() {
//		return new RedisRateLimiter(1, 2);
//	}

//	@Bean
//	SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http) throws Exception {
//		return http.httpBasic().and()
//				.csrf().disable()
//				.authorizeExchange()
//				.pathMatchers("/anything/**").authenticated()
//				.anyExchange().permitAll()
//				.and()
//				.build();
//	}
//
//	@Bean
//	public MapReactiveUserDetailsService reactiveUserDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
//		return new MapReactiveUserDetailsService(user);
//	}


    public static void main(String[] args) {
        SpringApplication.run(LarkGatewayApplication.class, args);
    }
}

