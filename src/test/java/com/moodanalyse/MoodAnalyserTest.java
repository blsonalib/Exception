package com.moodanalyse;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnsad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("This is a sad Message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldreturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("This is my Happy Messaege");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_forNuLLEXception(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}