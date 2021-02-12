package com.espinozajgch.cv.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL
    private int id;

    private String name;
    private String link;

    public Skills() {
    }

    public Skills(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Objects.equals(id, skills.id) &&
                Objects.equals(name, skills.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
