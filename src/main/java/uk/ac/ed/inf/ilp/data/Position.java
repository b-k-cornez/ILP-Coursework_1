package uk.ac.ed.inf.ilp.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Position {

    @JsonProperty("lat")
    private double latitude;
    @JsonProperty("lng")
    private double longitude;
}
