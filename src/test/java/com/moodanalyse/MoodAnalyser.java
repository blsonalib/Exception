package com.moodanalyse;

import javax.swing.*;

public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalysisException{
     try {
             if (message.contains("SAD"))
             {
               return "SAD";
              }
             else
             {
                return "HAPPY";
             }
          }catch(NullPointerException e)
          {
              throw new MoodAnalysisException("please enter proper message");
          }
    }

}


