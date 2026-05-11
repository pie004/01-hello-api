package com.example.hello_api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("hello")
    public String hello()
    {
        return "Hello, World!";
    }

    @GetMapping("greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Hello, " + name + "!";
    }

    @GetMapping("greet")
    public String greeetByLanguage(@RequestParam String language)
    {
        if(language.equalsIgnoreCase("french"))
        {
            return "bonjour!";
        }
        else if (language.equalsIgnoreCase("bengali"))
        {
            return "nomoshkar!";
        }
        else
        {
            return "hello!";
        }
    }

    @PostMapping("echo")
    public Map<String , Object> showData(@RequestBody Map<String , Object> data)
    {
        return data;
    }
}
