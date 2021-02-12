package com.espinozajgch.cv.model;

import javax.persistence.*;

@Entity
@Table(name = "WorkExperience")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL
    private int id;

    private String position;
    private String workday;
    private String company;
    private String location;
    private String startYear;
    private String endYear;

    @Column(name = "active", columnDefinition = "boolean default false")
    private Boolean active = false;

    private String link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
