package com.espinozajgch.cv.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CurriculumVitaeTest {

    private CurriculumVitae curriculumVitae;

    @Before
    public void setUp() throws Exception {

        curriculumVitae = Mockito.mock(CurriculumVitae.class);

        Mockito.when(curriculumVitae.getSkills()).thenReturn(
                Arrays.asList(
                        new Skills(1, "Spring Boot"),
                        new Skills(2, "Java")
                )
        );

    }

    @Test
    public void allSkills(){

        Collection<Skills> skills = curriculumVitae.getSkills();

        assertThat( skills, is(Arrays.asList(
                new Skills(1, "Spring Boot"),
                new Skills(2, "Java")
        )) );
    }

}