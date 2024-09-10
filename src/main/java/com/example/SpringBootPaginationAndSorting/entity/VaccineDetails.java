package com.example.SpringBootPaginationAndSorting.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class VaccineDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String vaccineName;
    private String vaccineCompany;

    public VaccineDetails(String vaccineName,String vaccineCompany) {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
    }

    @Override
    public String toString() {
        return "VaccineDetails{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCompany='" + vaccineCompany + '\'' +
                '}';
    }

}
