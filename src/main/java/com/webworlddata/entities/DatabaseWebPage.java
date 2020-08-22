package com.webworlddata.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.URL;

import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class DatabaseWebPage {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String webpagename;

    @NotNull
    @URL
    private String url;

    @NotNull
    private String description;

    DatabaseWebPage(){}

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebpagenameName() {
        return webpagename;
    }

    public void setWebpagename(String webpagename) {
        this.webpagename = webpagename;
    }
}
