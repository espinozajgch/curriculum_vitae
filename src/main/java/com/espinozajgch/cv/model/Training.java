package com.espinozajgch.cv.model;

import javax.persistence.*;

@Entity
@Table(name = "Training")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL
    private int id;

    private String degree;
    private String university;
    private String academicDiscipline;
    private String startYear;
    private String endYear;
    private String summary;
    private String link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getAcademicDiscipline() {
        return academicDiscipline;
    }

    public void setAcademicDiscipline(String academicDiscipline) {
        this.academicDiscipline = academicDiscipline;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
