package service.work.carrentalclub.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindCarDto {
    @JsonProperty("active")
    private Boolean active;
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
