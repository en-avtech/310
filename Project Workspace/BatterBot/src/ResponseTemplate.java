/**
 * Implements the Response Template Interface
 * @author Yasha
 *
 */
public class ResponseTemplate implements ResponseTemplateInterface
{
	/**
	 * A unique ID that can be used to identify the response template.
	 */
	public int ID = 0;
	/**
	 * A counter that should be incremented each time a new response
	 * template object is instantiated so as to preserve the uniqueness
	 * of the response templates.
	 */
	public static int IDCounter = 0;
	
	/**
	 * This is an array of strings that form the parts of the response delimited
	 * by words that need to be filled in. For example suppose the response
	 * template was: "Are you feeling _______? I am feeling __________." then the response would be stored as:
	 * response = {"Are you feeling ", "? I am feeling ", "."};
	 */
	public String[] response = null;


	/**
	 * This is an array of word buckets. These correspond to the blanks that are
	 * left in the response string. For example, if the response string is stored
	 * as: response = {"Are you feeling ", "? I am feeling ", "."}; then the corresponding word bucket
	 * might be filled with: 
	 * 
	 * blanks = {{"happy", "sad", "lonely", "angry", "amused", "bored"},
	 * 			 {"happy", "sad", "lonely", "angry", "amused", "bored"}};
	 * 
	 * Where the first array corresponds to a list of words which can be used
	 * to fill in the first blank in the response template, and similarly the 
	 * second array is a list of words that can be used to fill in the second
	 * blank in the response template. 
	 * 
	 * See also WordBuckets.java
	 */
	public String[][] wordBuckets = null;
	
	/**
	 * Constructor to build a response template.
	 * This constructor also assigns a unique ID to each responseTemplate.
	 * 
	 * @param response An array of strings that form the parts of the response delimited by blank words.
	 * @param wordBuckets An array of string arrays, or word buckets, that fill in the blanks in the response.
	 */
	public ResponseTemplate(String[] response, String[][] wordBuckets)
	{
		this.ID = IDCounter++;
		
		this.response = response;
		this.wordBuckets = wordBuckets;
		
	}
	

	public boolean isValediction() {
		// TODO Auto-generated method stub
		return false;
	}


	public String toString()
	{
		String str = "";

		for(int i = 0; i < response.length; i++)
		{
			str+= response[i];
			if (i < response.length - 1)
				str+= "_________";
		}

		return str;
	}
}
