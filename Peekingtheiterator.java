class Peekingtheiterator implements Iterator<Integer> {
    Integer NextEl = null;
    Iterator<Integer> it = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
        this.NextEl = it.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return NextEl;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = NextEl;
        if(it.hasNext()){
            this.NextEl = it.next();
        }
        else{
            NextEl = null;
        }
        return val;
	}
	
	@Override
	public boolean hasNext() {
	   return NextEl != null;
	}
}
