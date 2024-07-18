package com.javaCDG.CDGp.controller;


//import org.springframework.beans.factory.annotation.Autowired;
import com.javaCDG.CDGp.entities.User;
import com.javaCDG.CDGp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController("/users")
public class UserController {

    @Autowired
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    // Logique pour récupérer tous les utilisateurs
    @GetMapping("/getall")
    public List<User> getAllUsers() {
        List<User> all = userRepo.findAll();
        return all;
    }
    // Logique pour récupérer un utilisateur par son ID
    @GetMapping("/id")
    public User getUserById(@PathVariable Long id) {

        return null;
    }

    // Logique pour creer un nouvel utilisateur
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {

        return null;
    }

    // Logique pour mettre à jour un utilisateur existant
    @PutMapping("/MAJ")
    public ResponseEntity<User> updateUser(@PathVariable Long Id, @RequestBody User user) {

        return null;
    }

    // Logique pour supprimer un utilisateur

    @DeleteMapping("/supp")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return null;
    }
}





//// src/main/java/com/example/demo/controller/UserController.java
//package Controller;
//
//import Services.UserService;
//import entities.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import Repository.UserRepo;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/users")  // Correct base path
//public class UserController {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Autowired
//    private UserService userService;
//
//    // Constructor injection is not necessary with field injection
//    // public UserController(UserRepo userRepo) {
//    //     this.userRepo = userRepo;
//    // }
//
//    // Logique pour récupérer tous les utilisateurs
//    @GetMapping
//    public List<User> getAllUsers() {
//        return userRepo.findAll();
//    }
//
//    // Logique pour récupérer un utilisateur par son ID
//    @GetMapping("/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable Long id) {
//        Optional<User> user = userRepo.findById(id);
//        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    // Logique pour créer un nouvel utilisateur
//    @PostMapping
//    public ResponseEntity<User> createUser(@RequestBody User user) {
//        User savedUser = userRepo.save(user);
//        return ResponseEntity.ok(savedUser);
//    }
//
//    // Logique pour mettre à jour un utilisateur existant
//    @PutMapping("/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
//        if (!userRepo.existsById(id)) {
//            return ResponseEntity.notFound().build();
//        }
//        user.setId(String.valueOf(id));
//        User updatedUser = userRepo.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }
//
//    // Logique pour supprimer un utilisateur
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
//        if (!userRepo.existsById(id)) {
//            return ResponseEntity.notFound().build();
//        }
//        userRepo.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//}
