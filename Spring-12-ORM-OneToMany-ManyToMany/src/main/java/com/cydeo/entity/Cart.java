package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "carts")
public class Cart extends BaseEntity{


    @ManyToMany
    @JoinTable(name= "car_item_rel",    //this is a naming convention to show the  joint table
    joinColumns = @JoinColumn(name="c_id"),
    inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> itemList;

}
