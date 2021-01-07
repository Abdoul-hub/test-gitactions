/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cabral
 */
@RestController
@RequestMapping("homes")
public class HomeController {

    @GetMapping("names")
    public List<String> getName() {
        return Arrays.asList("Cabral est le meilleur", "Molo est con", "Mama est la petie soeur", "Papa fume du joint", "Dra fait son malin");
    }

    @GetMapping("hobbies")
    public List<String> getHobbies() {
        return Arrays.asList("Eat", "Sleep", "Code");
    }
}
