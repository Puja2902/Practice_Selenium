package selenium;

public class Replace {

	public static void main(String[] args) {
		String res = getMessage("Ps");
		System.out.println(res);

	}
public static String getMessage(String userName ) {
	String stt = "Hello <userName>, \n All the best.";
	stt = stt.replace("<userName>", userName);
	return stt;
	
}
	
	

}
