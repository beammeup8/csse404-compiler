package dataStructures.parseTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import dataStructures.ParserType;

public abstract class Node implements Iterable<Node>{
	protected List<Node> children;
	public String symbol;
	public ParserType type;
	
	public Node(String symbol, ParserType type){
		this.children = new ArrayList<Node>();
		this.symbol = symbol;
		this.type = type;
	}
	
	public ParserType getType(){
		return type;
	}
	
	public abstract void optimize();
	
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("( ");
		builder.append(type.name());
		builder.append(" ");
		
		if(children.isEmpty()){
			builder.append(symbol);
			builder.append(" ");
		}else{
			for (int i = 0; i < children.size(); i++) {
				builder.append(children.get(i).toString());
			}
		}
		
		builder.append(")");
		return builder.toString();
	}
	
	public Iterator<Node> iterator(){
		return new Iterator<Node>() {
			int childIndex = -1;
			Iterator<Node> childIter;

			@Override
			public boolean hasNext() {
				if(childIndex == -1){
					return true;
				}
				if(childIndex > children.size() || children.isEmpty()){
					return false;
				}
				return true;
			}

			@Override
			public Node next() {
				if(childIndex == -1){
					updateChildIter();
					return Node.this;
				}
				if(childIter.hasNext()){
					return childIter.next();
				}
				updateChildIter();
				if(childIndex >= children.size()){
					throw new NoSuchElementException();
				}
				return childIter.next();
			}
			
			private void updateChildIter(){
				childIndex ++;
				if(childIndex < children.size()){
					childIter = children.get(childIndex).iterator();
				}
			}
			
		};
	}
}
