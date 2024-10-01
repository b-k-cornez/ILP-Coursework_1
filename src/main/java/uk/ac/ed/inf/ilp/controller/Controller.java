package uk.ac.ed.inf.ilp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/isAlive")
    public boolean isAlive(){
        return true;
    }

    @GetMapping("/studentId/{name}")
    public String studentId(@PathVariable String name){
        if (name.equalsIgnoreCase("Bevan")) {
            return "s2295106";
        } else {

            return "Name not found";
        }

    }


}
