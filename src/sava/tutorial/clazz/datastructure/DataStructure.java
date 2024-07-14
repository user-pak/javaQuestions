package sava.tutorial.clazz.datastructure;

public class DataStructure {
	
	private int[] arrayOfInts = new int[15];
	
	public DataStructure() {
		
		for(int i = 0; i < arrayOfInts.length; i++) {
			
			arrayOfInts[i] = i;
			System.out.print(arrayOfInts[i]);
		}
	}
	
	private class EvenIterator implements java.util.Iterator<Integer> {

		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub	
			
			return nextIndex < arrayOfInts.length -1;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			
			nextIndex += 2;
			return Integer.valueOf(arrayOfInts[nextIndex]);

		}
		
		
	}
	
	public void printDataStructure() {
		
//		EvenIterator evenIterator = this.new EvenIterator();
//		
//		while(evenIterator.hasNext()) {
//			
//			System.out.print(evenIterator.next() + " ");
//		}
		
		for(int i = 0; i < arrayOfInts.length; i +=2) {
			
			System.out.print(arrayOfInts[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStructure data = new DataStructure();
		data.printDataStructure();
	}


}
