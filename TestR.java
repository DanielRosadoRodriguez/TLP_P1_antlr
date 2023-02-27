import org.antlr.v4.runtime.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestR {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromPath(Paths.get(args[0]), StandardCharsets.UTF_8);
        RLexer lexer = new RLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RParser parser = new RParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.prog();
        tree.inspect(parser); // show in gui
        //tree.save(parser, "/tmp/R.ps"); // Generate postscript
        System.out.println(tree.toStringTree(parser));
    }
}
