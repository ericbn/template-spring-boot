package com.avenuecode.template.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TemplateController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "Hello World";
    }
}
