package practice.chap06.bubbleSortA;

import practice.chap06.bubbleSort.EmptyStorageException;

public class BubbleSortA {
	private int[] storage;
	
	private int size;
	
	public BubbleSortA(int n) {
		this.size = n;
		this.storage = new int[n];
	}
	
	public int getSize() {
		return size;
	}
	
	public int indexOf(int i) {
		return storage[i];
	}
	
	public void put(int i, int n) {
		this.storage[i] = n;
	}

	public void bubbleSort() throws EmptyStorageException {
		if(size <= 0) {
			throw new EmptyStorageException();
		}
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = size - 2; j >= i; j--) {
				if(storage[j] > storage[j + 1]) {
					int temp = storage[j];
					storage[j] = storage[j + 1];
					storage[j + 1] = temp;
				}
			}
		}
		
		System.out.println("오름차순으로 정렬했습니다.");
	}
}
