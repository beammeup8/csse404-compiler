package dataStructures.inter1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataStructures.simpleInter.Program;
import exceptions.CustomException;

public class InterProgram1 implements IInter1 {

	List<InterClass1> classes;

	public InterProgram1(List<InterClass1> classes) {
		this.classes = classes;
	}
	
	@Override
	public String toString() {
		return classes.toString();
	}
	
	public void createSymbolTable(){
		try {
			populateSymbolTable(null, null);
		} catch (CustomException exception) {
			exception.printStackTrace();
			System.exit(0);
		}
	}
	
	@Override
	public void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException {
		SymbolTable table = new SymbolTable(parent);
		Map<String, InterClass1> namesToClasses = new HashMap<>();
		Map<InterClass1, InterClass1> superClasses = new HashMap<>();
		Map<InterClass1, SymbolTable> classTables = new HashMap<>();
		for (InterClass1 x : classes) {
			x.addMethodsToSymbolTable(table);
			namesToClasses.put(x.getClassName(), x);
			if (x.getSuperClassName() == null) {
				classTables.put(x, x.prepareSymbolTable(table, namesToClasses));
			}
		}
		for (InterClass1 x : classes) {
			if (x.getSuperClassName() != null) {
				superClasses.put(namesToClasses.get(x.getClassName()), namesToClasses.get(x.getSuperClassName()));
			}
		}
		
		while (classTables.size() < classes.size()) {
			for (InterClass1 x : classes) {
				if (!classTables.containsKey(x)) {
					InterClass1 superClass = superClasses.get(x);
					if (superClass != null && classTables.containsKey(superClass)) {
						classTables.put(x, x.prepareSymbolTable(classTables.get(superClass), namesToClasses));
					}
				}
			}
		}
		for (InterClass1 c : classes) {
			c.populateSymbolTable(table, namesToClasses);
		}
	}
	
	public Program toCodeBlock(String filename){
		Program progBlock =  new Program(filename);
		classes.forEach(x -> progBlock.addAll(x.toCodeBlock()));
		return progBlock;
	}
}
