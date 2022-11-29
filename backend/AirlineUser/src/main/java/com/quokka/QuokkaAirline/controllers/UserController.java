package com.quokka.QuokkaAirline.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quokka.QuokkaAirline.models.HttpResponse;
import com.quokka.QuokkaAirline.models.User;
import com.quokka.QuokkaAirline.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public HttpResponse getUsers() {
        try {
            List<User> data = userService.findAll();
            if (data.toString() == null || data.toString() == "[]")
                return new HttpResponse("", "No users found", false);
            else
                return new HttpResponse(data.toString(), "Users found", true);

        } catch (Exception e) {
            return new HttpResponse("", "No users found", false);
            // TODO: handle exception
        }

    }

    @GetMapping("/{id}")
    public HttpResponse findbyId(@PathVariable String id) {
        try {
            User data = userService.findById(id).get();
            return new HttpResponse(data.toString(), "User found", true);
        } catch (Exception e) {
            // TODO: handle exception
            return new HttpResponse("", "User not found", false);
        }

    }

    @PostMapping()
    public HttpResponse save(@RequestBody User user) {
        try {
            userService.findById(user.getDocument()).get();
            return new HttpResponse("", "User already exists", false);
        } catch (Exception e) {
            // TODO: handle exception
            userService.save(user);
            return new HttpResponse("", "User saved", true);
        }
    }

    @PutMapping("/{id}")
    public HttpResponse update(@PathVariable String id, @RequestBody User user) {
        try {
            userService.findById(id).get();
            userService.save(user);
            return new HttpResponse("", "User saved", true);
        } catch (Exception e) {
            // TODO: handle exception
            return new HttpResponse("", "User doesn't exists", false);
        }
    }

    @DeleteMapping("/{id}")
    public HttpResponse deleteById(@PathVariable String id) {
        try {
            userService.findById(id).get();
            userService.deleteById(id);
            return new HttpResponse("", "User deleted", true);
        } catch (Exception e) {
            return new HttpResponse("", "User doesn't exist", false);
            // TODO: handle exception
        }
    }
}
