/**
 * This is the main driver class that controls the batterbot.
 * 
 * This class will handled all of the necessary IO operations through the use
 * of a IO class 
 * 
 * @author Yasha
 *
 */
public class BatterBotDriver 
{
	private IOInterface IO = null;
	private LanguageProcessorInterface LP = null;
	private ResponseSelectorInterface RS = null;
	private ResponseBuilderInterface RB = null;
	
	/**
	 * Basic constructor which sets up the IO class.
	 * All other necessary classes should be set to default (needs implementation still).
	 * 
	 * @param IO The class that will handle the IO operations
	 */
	public BatterBotDriver(IOInterface IO)
	{
		this.IO = IO;
	}
	
	
	/**
	 * The main function that can be called to interact with the batterbot. This function
	 * handles all of the IO operations, message decoding, response building, and will
	 * terminate naturally when the batterbot decides that conversation is over and sends
	 * a valediction.
	 */
	public void cycle()
	{
		String input;
		
		while(true)
		{
			//This is expected to block waiting for input
			input = IO.read(); 
			
			//Decode the user input into keywords
			KeyWordListInterface keys = LP.extractKeyWords(input);
			
			//Select the next response template
			ResponseTemplateInterface template = RS.selectTemplate(keys);
			
			//Build the response from template
			String response = RB.buildResponse(template, keys);
			
			//Print the next response
			IO.print(response);
			
			//Checks if the batterbot intends to end the conversation.
			if(template.isValediction())
				break;
		}
	}
	
}
