package stringExercise;

public class FirstOccuranceOfSubString {


	public static void main(String[] args)
	{
		String s1="India is my country, india ";
		findFirstOccurance(s1);

	}

	private static int findFirstOccurance(String s1) 
	{
	    s1=s1.substring(8,12);
	   int result =s1.indexOf("5");
	   System.out.println("First Occurance Of Given Substring:"+result);
		return result;
	}
}


