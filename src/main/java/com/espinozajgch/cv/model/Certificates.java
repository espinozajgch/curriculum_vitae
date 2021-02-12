package com.espinozajgch.cv.model;

import javax.persistence.*;

@Entity
@Table(name = "Certificates")
public class Certificates {

    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "certificates_generator")
    //@SequenceGenerator(name="certificates_generator", sequenceName = "certificates_seq", allocationSize=50)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL
    private Integer id;

    @Column(name="name")
    private String name;

    private String company;
    private String startYear;
    private String endYear;

    @Column(name = "expires", columnDefinition = "boolean default true")
    private boolean expires;

    private String link;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public boolean isExpires() {
        return expires;
    }

    public void setExpires(boolean expires) {
        this.expires = expires;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
