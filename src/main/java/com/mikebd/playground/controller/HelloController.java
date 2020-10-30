package com.mikebd.playground.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * https://docs.micronaut.io/latest/guide/index.html#creatingServer
 */
@Controller("/hello")
public class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World";
    }
}