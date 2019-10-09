public class Application{
	public static void main(String [] args) {
		String text1 = "Happy to hear";
		String text2 = "Mari e brava";
		
		
		System.out.println( fullSentence(text2)+"\n"+ fullSentence(text1));
	}
	
	public static String fullSentence ( String text) {
		String senten = "La tua stringa e : " + text;
		return senten;
	}
}
