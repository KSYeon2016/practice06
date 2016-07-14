package prob4;

public class MyStack implements Stack {
	String[] buffer = null;
	int i;
	
	public MyStack(int capacity) {
		buffer = new String[capacity];	// 3
		i = 0;
	}

	@Override
	public void push(String item) {
		buffer[i] = item;
		i++;
	}

	@Override
	public String pop() throws MyStackEmptyException {
		try{
			i--;
			return buffer[i];
		}catch(Exception ex){
			throw new MyStackEmptyException("MyStack is Empty");
		}
	}

	@Override
	public boolean isEmpty() {
		if(i == 0){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

}
