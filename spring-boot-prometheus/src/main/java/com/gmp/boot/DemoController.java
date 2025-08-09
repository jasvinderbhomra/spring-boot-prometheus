package com.gmp.boot;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    private final MeterRegistry registry;

    public DemoController(MeterRegistry registry) {
        this.registry = registry;
    }

    @GetMapping("/hello")
    public String hello() {
        registry.counter("demo.hello.calls").increment();
        return "hello from spring boot";
    }
}
