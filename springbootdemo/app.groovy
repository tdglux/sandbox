@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }

    @RequestMapping("/ping")
    String pingpong() {
        "pong"
    }

}