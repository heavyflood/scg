package com.phs.scg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class DefaultController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public Mono<String> getUser(ServerHttpRequest request, ServerHttpResponse response) {

    	logger.info("This is Gateway MicroService!!!!!");
        return Mono.just("This is Gateway MicroService!!!!!");
    }

}
