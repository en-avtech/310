/**
 * The response graph class.
 * 
 * This one is making me more and more nervous.
 * 
 * @author Yasha
 *
 */
public class ResponseGraph implements ResponseGraphInterface
{
	private class node
	{
		private ResponseTemplate RT;
		private node[] edges;
	}
	
	public ResponseGraph()
	{
		
	}
	

	@Override
	public ResponseTemplateInterface[] getResponses()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePosition(int responseID) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
