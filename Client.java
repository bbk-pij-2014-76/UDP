import java.io.File;

public interface Client
{

	String getID();

	void setID(String id);

	/**
	* Requests for a unique ID
	*
	* @return message request for a unique ID.
	*/
	String askClientID();


	String firstToConnect();

	
	File receiveAudio();

	void playAudio(File file);

}