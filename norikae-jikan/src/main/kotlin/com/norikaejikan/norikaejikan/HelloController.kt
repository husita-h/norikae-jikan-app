package com.norikaejikan.norikaejikan

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun getJson(): HelloData {
        return HelloData(
            id = 1,
            title = "exTitle"
        )
    }
}