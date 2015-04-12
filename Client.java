import java.io.File;

public interface Client
{

	String clientID();

	void clientID(String id);

	/**
	* Requests for a unique ID
	*
	* @return message request for a unique ID.
	*/
	String askClientID();


	String firstToConnect();

	void sendAudio(File audioFile);

	File receiveAudio();

	void playAudio(File audioFile);

}