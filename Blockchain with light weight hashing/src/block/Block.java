package block;
import java.util.Arrays;
import sha192.hash;

public class Block {

	private String previoushash;
	private String transactions;
	
	private String blockhash;
	
	public Block(String previoushash, String block1transactions) {
		this.previoushash = previoushash;
		this.transactions = block1transactions;
		
		String content = hash.sha192(block1transactions) + previoushash;
		this.blockhash = hash.sha192(content);
		
	}

	public String getBlockhash() {
		return blockhash;
	}
	
	
}
