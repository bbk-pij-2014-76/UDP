/**
 * @(#)ClientImp.java
 *
 *
 * @author 
 * @version 1.00 2015/4/15
 */
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ClientImp implements Client  {

   

    private String ID;
	public String getID() {
        return ID;
    }
    public String askClientID() 
    {
        return(ID);
    }

    public void setID(String id) 
    {
        ID = id;
    }
    public void playAudio(File file) {
    	try
    	{
	    	Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
    	}
    	catch (LineUnavailableException ex) {
            System.out.println(ex.getMessage());
        } catch (UnsupportedAudioFileException ex) {
            System.out.println(ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
		
    }
    public File receiveAudio() {
        return null;
    }
    public String firstToConnect() {
        String msg = "requestROLE"+askClientID();
        return(msg);
    }
   
}
 
