import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@EnableAutoConfiguration
class Example {

    @RequestMapping('/')
    String home() {
        'Hello World!'
    }

    static void main(String... args) {
        SpringApplication.run(Example, args)
    }
}
