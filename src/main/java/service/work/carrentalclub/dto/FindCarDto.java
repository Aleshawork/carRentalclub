package service.work.carrentalclub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindCarDto {
    @JsonProperty("number")
    private String number;
    @JsonProperty("color")
    private String color;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("year")
    private int year;
    @JsonProperty("mark")
    private String mark;
    @JsonProperty("typeOfCar")
    private String typeOfCar;

}
