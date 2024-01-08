package com.kotolin.docker.server.routes

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping("/api/v1/images")
class Image {
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/")
    fun getImages ():String {
        return "Get Images!!!OKGoodjobOKKK???"
    }
    @CrossOrigin
    @ResponseStatus(code = HttpStatus.OK)
    @GetMapping("/all/")
    fun getImagesAll ():InterfaceImage {
        return InterfaceImage("TaroJiroSaburoこんちは",20)
    }
}