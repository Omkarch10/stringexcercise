package stringExercise;



	public class RemovedWhiteSpaces {


		public static String removedWhiteSpaces(String s )
		{
			return s.replaceAll(" ","");


		}

		public static void main(String[] args) {

			String s= " wel come ";
			String removedSpaces=removedWhiteSpaces(s);

			System.out.println("original string is :"+s);
			System.out.println("after white space removal string is :"+removedSpaces);

		}

	}

