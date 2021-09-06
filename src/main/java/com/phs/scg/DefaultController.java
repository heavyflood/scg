package com.phs.scg;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DefaultController {
	
    @GetMapping("/")
    public Mono<String> getUser(ServerHttpRequest request, ServerHttpResponse response) {

        return Mono.just("This is Gateway MicroService!!!!!");
    }

}
