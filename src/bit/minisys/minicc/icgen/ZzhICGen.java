package bit.minisys.minicc.icgen;

import org.python.util.PythonInterpreter;
import org.python.core.PyFunction;

public class ZzhICGen {
    public String run(String iFile) throws Exception {
        
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile(".\\src\\bit\\minisys\\minicc\\icgen\\main.py");
        PyFunction pyFunction = interpreter.get("node_view", PyFunction.class);
        
        return iFile+".ic";
    }
}
