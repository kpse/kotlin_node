external fun require(module: String): dynamic

fun main(args: Array<String>) {
    println("hello all!")

    val express = require("express")
    val app = express()

    app.get("/", {
        req, res ->
            res.type("text/plain")
        res.send("I am a string")
    })

    val port = 3000
    app.listen(port, {
        println("Listening on port $port")
    })
}