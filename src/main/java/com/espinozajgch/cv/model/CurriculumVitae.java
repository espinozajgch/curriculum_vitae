package com.espinozajgch.cv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CurriculumVitae")
public class CurriculumVitae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment MySQL
    private int id;

    @OneToOne //(cascade = {CascadeType.ALL})
    @JoinColumn(name = "idPersonalInformation") // foreignKey en la tabla de PersonalInformation
    private PersonalInformation personalInformation;

    // Relacion OneToMany (Un usuario tiene muchos estudios)
    // Por defecto Fetch es FetchType.LAZY
    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    /*JPA Join Fetch es una de las opciones de las que dispone el estándar de JPA a la hora de reducir el número de consultas que se generan contra la base de datos.*/
    @JoinTable(name = "CurriculumVitaeTraining", // tabla intermedia
            joinColumns = @JoinColumn(name = "idCurriculumVitae", nullable = false, referencedColumnName="id"), // foreignKey en la tabla de CurriculumVitae
            inverseJoinColumns = @JoinColumn(name = "idTraining", nullable = false, referencedColumnName="id") // foreignKey en la tabla de Training
    )
    private List<Training> training;

    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(name = "CurriculumVitaeCertificates", // tabla intermedia
            joinColumns = @JoinColumn(name = "idCurriculumVitae", nullable = false, referencedColumnName="id"), // foreignKey en la tabla de CurriculumVitae
            inverseJoinColumns = @JoinColumn(name = "idCertificates", nullable = false, referencedColumnName="id") // foreignKey en la tabla de Certificates
    )
    private List<Certificates> certificates;

    @OneToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(name = "CurriculumVitaeWorkExperience", // tabla intermedia
            joinColumns = @JoinColumn(name = "idCurriculumVitae", nullable = false, referencedColumnName="id"), // foreignKey en la tabla de CurriculumVitae
            inverseJoinColumns = @JoinColumn(name = "idWorkExperience", nullable = false, referencedColumnName="id") // foreignKey en la tabla de WorkExperience
    )
    private List<WorkExperience> workExperience;

    /*La anotación @Transient se utiliza para indicarle a JPA que un atributo de una Entidad no debe de ser persistente*/

    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(name = "CurriculumVitaeSkills", // tabla intermedia
            joinColumns = @JoinColumn(name = "idCurriculumVitae", nullable = false, referencedColumnName="id"), // foreignKey en la tabla de CurriculumVitae
            inverseJoinColumns = @JoinColumn(name = "idSkills", nullable = false, referencedColumnName="id") // foreignKey en la tabla de Skills
    )
    private List<Skills> skills;

    //@JsonIgnore
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public void addTraining(Training trainingTemp){
        if(training==null){
            training = new ArrayList<Training>();
        }

        training.add(trainingTemp);
    }

    public List<Training> getTraining() {
        return training;
    }

    public void setTraining(List<Training> training) {
        this.training = training;
    }

    public void addCertificates(Certificates certificatesTemp){
        if(certificates==null){
            certificates = new ArrayList<Certificates>();
        }

        certificates.add(certificatesTemp);
    }

    public List<Certificates> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificates> certificates) {
        this.certificates = certificates;
    }

    public void addWorkExperience(WorkExperience workExperienceTemp){
        if(workExperience==null){
            workExperience = new ArrayList<WorkExperience>();
        }

        workExperience.add(workExperienceTemp);
    }

    public List<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(List<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    public void addSkills(Skills skillsTemp){
        if(skills==null){
            skills = new LinkedList<>();
        }

        skills.add(skillsTemp);
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurriculumVitae curriculumVitae = (CurriculumVitae) o;
        return  Objects.equals(id, curriculumVitae.id) &&
                Objects.equals(personalInformation, curriculumVitae.getPersonalInformation()) &&
                Objects.equals(training, curriculumVitae.getTraining()) &&
                Objects.equals(certificates, curriculumVitae.getCertificates()) &&
                Objects.equals(workExperience, curriculumVitae.getWorkExperience()) &&
                Objects.equals(skills, curriculumVitae.getSkills());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personalInformation, training, certificates, workExperience, skills);
    }
}
