package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="items")
public class Item extends  BaseEntity{

    private String name;
    private String code;

    @ManyToMany(mappedBy = "itemList") //mappedBy declares the ownership in this example cart has the ownership which has itemlist.
    private List<Cart> cartList;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
