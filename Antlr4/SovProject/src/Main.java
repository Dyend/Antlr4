import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;
 
public class Main {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {

        sovLexer lexer = new sovLexer(new ANTLRInputStream(new FileInputStream("./src/example.txt")));
        Token token = lexer.nextToken();
        while(token.getType() != Token.EOF) {
            System.out.println(
                    token.getType() + ":"
                    + token.getLine() + ":"
                    + token.getCharPositionInLine() + ":"
                    + token.getText());
            token = lexer.nextToken();
        }
    }
 
}
