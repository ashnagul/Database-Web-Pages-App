package com.webworlddata.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(max = 150)
    private String categoryname;

    @NotNull
    private String description;

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
