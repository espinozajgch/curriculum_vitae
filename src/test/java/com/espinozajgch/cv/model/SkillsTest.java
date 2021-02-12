package com.espinozajgch.cv.model;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SkillsTest {

    @Test
    public void testName(){

        Skills skills = Mockito.mock(Skills.class);
        Mockito.when(skills.getName()).thenReturn("Spring Boot");
        assertThat(skills.getName(), is("Spring Boot"));
    }
}