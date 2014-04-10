import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
/**
 * Interpreter skryptu odpowiedzialny za wywo³anie dla zadanej œcie¿ki leksera i
 * parsera.
 * 
 * @author Piotr Jastrzêbski
 * 
 */
public class ScriptInterpreter {
	/** Metoda odpowiedzialna za proces parsowania */
	public static boolean parseIt(String myPath) {
		ANTLRStringStream in;
		try {
			in = new ANTLRFileStream(myPath);
		} catch (IOException e1) {
			e1.printStackTrace();
			in = null;
		}
		TkomLexer lexer = new TkomLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TkomParser parser = new TkomParser(tokens);
		try {
			return parser.eval();
		} catch (RecognitionException e) {
			e.printStackTrace();
			return false;
		}
	}
}
