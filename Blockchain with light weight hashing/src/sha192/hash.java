package sha192;
import java.util.*;

public class hash{
	
	public static String hash(String text) {
		  String hash = sha192(text);
	      return hash;
	      
	}
	
	public static String sha192(String data) {
		try{
			sha192Digest digest = sha192Digest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1)
			    hexString.append('0');
				hexString.append(hex);
			}

			return hexString.toString();
		} catch(Exception ex){
			throw new RuntimeException(ex);
		}
	}
	
}