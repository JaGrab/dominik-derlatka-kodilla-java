package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student adamInferior = new JavaStudent("Adam Inferior");
        Student lisaMinor = new JavaStudent("Lisa Minor");
        Student notSoGood = new JQueryStudent("Not SoGood");
        Student notSoBad = new JQueryStudent("Not SoBad");
        Mentor javaOverlord = new Mentor("Java Overlord");
        Mentor jQueryMaster = new Mentor("jQuery Master");
        adamInferior.registerObserver(javaOverlord);
        lisaMinor.registerObserver(javaOverlord);
        notSoGood.registerObserver(jQueryMaster);
        notSoBad.registerObserver(jQueryMaster);
        //When
        adamInferior.addTask("AI engine");
        adamInferior.addTask("Big Bang controller");
        lisaMinor.addTask("Quantum queue");
        notSoGood.addTask("Solar system UI");
        notSoBad.addTask("Neutrino UX");
        //Then
        assertEquals(3, javaOverlord.getUpdateCount());
        assertEquals(2, jQueryMaster.getUpdateCount());
    }
}
