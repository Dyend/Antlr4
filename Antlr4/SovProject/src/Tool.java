import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;




@SuppressWarnings("deprecation")
public class Tool {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try
    	{
			System.out.println("Scanning file...");
			//usar example para codigo sov | wrongexample para codigo errado
			sovLexer lexer = new sovLexer(new ANTLRInputStream(new FileInputStream("./src/wrongexample.txt")));
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	    	sovParser parser = new sovParser(tokens);
	    	parser.sov();
	    	System.out.println("Finished.");
    	}
    	catch (Exception ex)
    	{
    		System.err.println("Error: " + ex.toString());
    	}
	}

}
