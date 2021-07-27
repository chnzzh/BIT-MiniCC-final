package bit.minisys.minicc.icgen;

import java.util.ArrayList;

public class SymbolTable {

    public ArrayList<SymbolItem> items;

    public SymbolTable() {
        this.items = new ArrayList<SymbolItem>();
    }

    public void addItem(SymbolItem item) {
        this.items.add(item);
    }

    public SymbolItem findItem(String findName) {
        for (SymbolItem s : this.items) {
            if (s.name.equals(findName)) {
                return s;
            }
        }
        return null;
    }
}
