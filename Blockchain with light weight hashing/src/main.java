import java.util.Arrays;
import block.Block;

public class main{

	public static void main(String args[]) {
		
		String previoushash = null;
		
		String genesistransactions = "A sends 1 Bitcoin to B" ;
		Block genesisblock = new Block(previoushash, genesistransactions);
		
		String block1transactions = "A sends 3 Bitcoin to C";
		Block block1 = new Block(genesisblock.getBlockhash(), block1transactions);
		
		String block2transactions = "A sends 1 Bitcoin to D";
		Block block2 = new Block(block1.getBlockhash(), block2transactions);
		
		System.out.println("Hash of genesis block:");
		System.out.println(genesisblock.getBlockhash());
		
		System.out.println("Hash of block1:");
		System.out.println(block1.getBlockhash());
		
		System.out.println("Hash of block2:");
		System.out.println(block2.getBlockhash());
	}
}
