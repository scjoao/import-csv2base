package dev.scjoao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produto implements Serializable {

    private String name;
    private Double price;
    private Integer quantity;

}
