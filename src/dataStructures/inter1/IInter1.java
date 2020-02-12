package dataStructures.inter1;

import java.util.Map;

import exceptions.CustomException;

public interface IInter1 {
	void populateSymbolTable(SymbolTable parent, Map<String, InterClass1> classMap) throws CustomException;
}
