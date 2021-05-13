package ua.lviv.iot.lab9.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {

    private int id;
    private String name;
    private double price;
    private int volumeInMl;
}
