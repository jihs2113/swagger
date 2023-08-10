package com.dofun.demo.sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/sample")
class SampleController {
    @Autowired
    lateinit var sampleService: SampleService

    @GetMapping("")
    fun fetchSampleList(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
    @PostMapping("")
    fun registSample(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
    @PutMapping("")
    fun modifySample(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
    @DeleteMapping("")
    fun removeSample(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
}