package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
@RestController
class DemoApplication {

	@RequestMapping("/ping")
	def ping() {
		"pong"
	}

   @RequestMapping("/pongo")
	def pongo() {
		new groovy.json.JsonBuilder([result: "pong"])
	}


    static void main(String[] args) {
        SpringApplication.run(DemoApplication, args)
    }
}
