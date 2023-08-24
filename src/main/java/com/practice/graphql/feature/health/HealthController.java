package com.practice.graphql.feature.health;


import an.awesome.pipelinr.Pipeline;
import com.practice.graphql.infrastructure.controller.BaseController;
import com.practice.graphql.infrastructure.service.AuthenticationManager;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class HealthController extends BaseController {

    public HealthController(Pipeline pipeline, AuthenticationManager authenticationManager) {
        super(pipeline, authenticationManager);
    }

    @QueryMapping
    public String health() {
        return "I'm OK";
    }
}
