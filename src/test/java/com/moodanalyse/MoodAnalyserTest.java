package com.moodanalyse;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnsad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood= null;
        try
        {
            mood = moodAnalyser.analyseMood("This is a sad Message");
        }
        catch (MoodAnalysisException e)
        {

        }
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldreturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood= null;
        try
        {
            mood = moodAnalyser.analyseMood("This is my Happy Messaege");
        }
        catch (MoodAnalysisException e) {
        }
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_forNuLLEXception()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        try
        {
               String mood = moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals("please enter proper message",e.getMessage());
        }

    }
}