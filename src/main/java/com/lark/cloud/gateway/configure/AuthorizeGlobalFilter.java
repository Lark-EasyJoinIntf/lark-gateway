//package com.lark.cloud.gateway.configure;
//
//
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
///**
// * token校验全局过滤器
// *
// * 只需要添加 @Component 注解，不需要进行任何额外的配置，实现GlobalFilter接口，自动会对所有的路由起作用
// *
// * @Version V1.0
// */
//@Component
//public class AuthorizeGlobalFilter implements GlobalFilter, Ordered {
//    private static final String AUTHORIZE_TOKEN = "token";
//    private static final String AUTHORIZE_UID = "uid";
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        HttpHeaders headers = request.getHeaders();
//        String token = headers.getFirst(AUTHORIZE_TOKEN);
//        String uid = headers.getFirst(AUTHORIZE_UID);
//
//        if (token == null) {
//            token = request.getQueryParams().getFirst(AUTHORIZE_TOKEN);
//        }
//        if (uid == null) {
//            uid = request.getQueryParams().getFirst(AUTHORIZE_UID);
//        }
//
//        ServerHttpResponse response = exchange.getResponse();
//        if (StringUtils.isEmpty(token) || StringUtils.isEmpty(uid)) {
//            response.setStatusCode(HttpStatus.UNAUTHORIZED);
//            return response.setComplete();
//        }
//        String authToken = stringRedisTemplate.opsForValue().get(uid);
//        if (authToken == null || !authToken.equals(token)) {
//            response.setStatusCode(HttpStatus.UNAUTHORIZED);
//            return response.setComplete();
//        }
//
//        return chain.filter(exchange);
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
