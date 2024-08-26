package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Country {
    private Long id;
    private String title;
    private int population;
}
