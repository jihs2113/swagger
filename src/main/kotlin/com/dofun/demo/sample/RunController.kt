package com.dofun.demo.sample

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/run")
class RunController {
    @Autowired
    lateinit var runService: RunService

    @GetMapping("")
    fun fetchRunSampleList(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
    @PostMapping("")
    fun registRunSample(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
    @PutMapping("")
    fun modifyRunSample(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
    @DeleteMapping("")
    fun removeRunSample(): ResponseEntity<Any> {
        return ResponseEntity.ok("Success")
    }
}