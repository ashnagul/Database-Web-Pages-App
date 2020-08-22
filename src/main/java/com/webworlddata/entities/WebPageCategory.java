package com.webworlddata.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class WebPageCategory {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DatabaseWebPage databaseWebPage;

    @NotNull
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Category category;

    @NotNull
    private long type;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public DatabaseWebPage getDatabaseWebPage() {
        return databaseWebPage;
    }

    public void setDatabaseWebPage(DatabaseWebPage databaseWebPage) {
        this.databaseWebPage = databaseWebPage;
    }

    public long getId() {
        return id;
    }

    public long getType() {
        return type;
    }


    public void setId(long id) {
        this.id = id;
    }


    public void setType(long type) {
        this.type = type;
    }

}

