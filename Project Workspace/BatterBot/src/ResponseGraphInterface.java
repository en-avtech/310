/**
 * The basic public methods available for interaction with the ResponseGraph.
 * 
 * @author Yasha
 *
 */
public interface ResponseGraphInterface
{
	/**
	 * Determines the possible valid response templates based on the 
	 * current position in the response graph.
	 * @return an array of responseTemplates
	 */
	public ResponseTemplateInterface[] getResponses();
	
	/**
	 * This method updates the current location of the
	 * response graph based on the ID of the response 
	 * selected by the ResponseSelctor.
	 * 
	 * @param the ID of the responseTemplate selected
	 * @return returns 1 on success, 0 on failure.
	 */
	public boolean updatePosition(int responseID);
		
}
