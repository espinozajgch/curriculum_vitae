package com.espinozajgch.cv.repository;

import com.espinozajgch.cv.model.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInformationRepo extends JpaRepository<PersonalInformation, Integer> {

}
