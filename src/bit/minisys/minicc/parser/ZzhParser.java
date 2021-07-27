package bit.minisys.minicc.parser;

import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

/**
 * @Author Zheng Zhihan
 * @Date 2021/5/5
 */
public class ZzhParser {

    public String run(String iFile) throws Exception {

        // read file
        CharStream sourceFile = CharStreams.fromFileName(iFile);

        // lexer -> token -> parser
        CbyZZHLexer lexer = new CbyZZHLexer(sourceFile);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CbyZZHParser parser = new CbyZZHParser(tokens);

        // tree start
        ParseTree tree = parser.program();

        // show image
        TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        treeViewer.open();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(iFile+".json"));
            out.write(toJson(tree));
            out.close();
            System.out.println(iFile+".json created!");
        } catch (IOException e) {
        }

        return iFile+".json";
    }


    private static final Gson GSON = new Gson();
    public static String toJson(ParseTree tree) {
        return GSON.toJson(toMap(tree));
    }

    public static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    public static void traverse(ParseTree tree, Map<String, Object> map) {

        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();
            map.put("type", CbyZZHLexer.VOCABULARY.getSymbolicName(token.getType()));
            map.put("id", token.getType());
            map.put("text", token.getText());
        }
        else if(tree.getChildCount() > 1 || tree.getChild(0) instanceof TerminalNodeImpl) {
            List<Map<String, Object>> children = new ArrayList<>();
            String name = tree.getClass().getSimpleName().replaceAll("Context$", "");

            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

            for (int i = 0; i < tree.getChildCount(); i++) {
                Map<String, Object> nested = new LinkedHashMap<>();
                children.add(nested);
                traverse(tree.getChild(i), nested);
            }
        }
        else {
            traverse(tree.getChild(0), map);
        }
    }
}
