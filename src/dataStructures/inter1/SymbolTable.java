package dataStructures.inter1;

import java.util.HashMap;

public class SymbolTable {
	SymbolTable parent;
	HashMap<String, SymbolEntry> table;

	public SymbolTable(SymbolTable parent) {
		this.parent = parent;
		this.table = new HashMap<>();
	}

	public void addEntry(String symbol, String type, int offset) {
		SymbolEntry entry = new SymbolEntry(type, IdGenerator.getUniqueId(), offset);
		SymbolEntry previousEntry = table.put(symbol, entry);
		if (previousEntry != null) {
			System.err.println("symbol: " + symbol + "has been declared more than once in this scope");
			System.exit(0);
		}
	}
	
	public void addEntry(String symbol, String type) {
		addEntry(symbol, type, -1);
	}

	public boolean checkType(String symbol, String type) {
		SymbolEntry entry = table.get(symbol);
		if (entry == null) {
			if (parent != null) {
				return parent.checkType(symbol, type);
			}
			return false;
		}
		return type.equals(entry.type);
	}

	public String getType(String symbol) {
		SymbolEntry entry = table.get(symbol);
		if (entry != null) {
			return entry.type;
		}
		return parent.getType(symbol);
	}

	public String getLocalName(String symbol) {
		SymbolEntry entry = table.get(symbol);
		if (entry != null) {
			return entry.localName;
		}
		return parent.getLocalName(symbol);
	}
	
	public int getOffset(String symbol) {
		SymbolEntry entry = table.get(symbol);
		if (entry != null) {
			return entry.offset;
		}
		return parent.getOffset(symbol);
	}

	private class SymbolEntry {
		public String type, localName;
		public int offset;
		
		public SymbolEntry(String type, String localName, int offset) {
			this.type = type;
			this.localName = localName;
			this.offset = offset;
		}
	}

}
