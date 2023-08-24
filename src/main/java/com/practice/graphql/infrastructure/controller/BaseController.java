package com.practice.graphql.infrastructure.controller;


import an.awesome.pipelinr.Pipeline;
import com.practice.graphql.infrastructure.service.AuthenticationManager;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class BaseController {

    protected Pipeline pipeline;
    protected AuthenticationManager authenticationManager;

}
