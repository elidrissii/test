package com.javaCDG.CDGp.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/roles")
public class RoleController {
    //
//    private final ServiceRole;
    @GetMapping
    public String getRole() {
        return "get role was called";
    }

    @PostMapping
    public <UserRole> String createRole(@RequestBody UserRole userRole) {
        return "create role was called";
    }

    @PutMapping
    public String updateRole() {
        return "update role was called";
    }

    @DeleteMapping
    public String deleteRole() {
        return "delete role was called";
    }
}


