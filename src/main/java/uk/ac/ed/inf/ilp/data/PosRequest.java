package uk.ac.ed.inf.ilp.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PosRequest {

    @JsonProperty("position1")
    public Position position1;
    @JsonProperty("position2")
    public Position position2;
}
