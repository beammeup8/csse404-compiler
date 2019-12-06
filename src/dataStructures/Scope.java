package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scope {
public  Map<String, Symbol> symbolTable = new HashMap<String, Symbol>();
public List<Scope> subScope = new ArrayList<Scope>();
}
