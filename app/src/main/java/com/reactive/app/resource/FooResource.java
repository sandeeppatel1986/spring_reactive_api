package com.reactive.app.resource;

import com.reactive.app.model.Foo;
import java.math.BigDecimal;
import java.time.Duration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/foo")
public class FooResource {

  @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  private Flux<Foo> getFoo(){
    return Flux.interval(Duration.ofSeconds(1)).log().map(val -> new Foo(BigDecimal.ONE, "foo"));
  }
}
