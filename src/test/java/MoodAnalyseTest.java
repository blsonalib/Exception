import com.moodanalyse.MoodAnalyser;
import com.moodanalyse.MoodAnalyserFactory;
import com.moodanalyse.MoodAnalysisException;
import com.moodanalyse.ObjectReflector;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyseTest {

    @Test
    public void givenMoodAnalyzerClass_createIntance()
    {
        try
        {
                 MoodAnalyser moodAnalyser= MoodAnalyserFactory.createMoodAnalyse("This is happy message");
                 String mood=moodAnalyser.analyseMood();
                 Assert.assertEquals("HAPPY",mood);
         }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException
    {
        MoodAnalyser analyser = new MoodAnalyser("please Enter valid Mood");
        String mood = analyser.analyseMood("THis is is SAD Message");
        Assert.assertEquals("SAD",mood );

    }
    @Test
    public void givenMessage_whenSad_shouldReturnHappy() throws MoodAnalysisException
    {
        MoodAnalyser analyser = new MoodAnalyser("please Enter valid Mood");
        String mood = analyser.analyseMood("THis is is HAPPY Message");
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void  givenMessage_whenthemoodnull_shouldReturnHappy()
    {
        MoodAnalyser analyser = new MoodAnalyser(null);
        try
        {
            String mood = analyser.analyseMood(null);
        }
        catch(MoodAnalysisException e)
        {
            Assert.assertEquals("please enter proper message" ,e.getMessage());
        }
    }
    @Test
    public void givenMessage_WhenProper_Should_Return_Object_Using_Reflector() throws IllegalAccessException {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        ObjectReflector.dump(moodAnalyser,0);
    }
}

