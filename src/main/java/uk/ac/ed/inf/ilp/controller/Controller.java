package uk.ac.ed.inf.ilp.controller;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import uk.ac.ed.inf.ilp.data.EuclideanDistance.*;
import uk.ac.ed.inf.ilp.data.PosRequest;

import static uk.ac.ed.inf.ilp.data.EuclideanDistance.calcDistance;

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

    @GetMapping("/req_position")
    public String req_position(@RequestBody PosRequest pos, HttpServletResponse response){
        if(pos == null || pos.position1 == null || pos.position2 == null){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return "Position is null";
        }

        return "Positions are: " + "Position 1 = " + pos.position1.getLongitude() + ", " + pos.position1.getLatitude()
                + " Position2 = " + pos.position2.getLongitude() + ", " + pos.position2.getLatitude();
    }

    @PostMapping("/distanceTo")
    public double distanceTo(@RequestBody PosRequest pos){
        return Math.sqrt(Math.pow(pos.position2.getLongitude() - pos.position1.getLongitude(), 2)
                + Math.pow( pos.position2.getLatitude() - pos.position1.getLatitude(), 2));
    }
}
