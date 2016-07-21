package prob4;

public class MyStack implements Stack {
	String[] buffer = null;
	int position = -1;	// 현재 스택의 top
	
	public MyStack(int capacity) {
		buffer = new String[capacity];	// 3
	}

	@Override
	public void push(String item) {
		//새로 들어가야 할 position이 버퍼 사이즈이면(position은 0부터 시작함)
		if( position + 1 == buffer.length) {
			//버퍼 크기를 늘림
			resizeBuffer();
		}

		//새로 들어갈 위치(top)에 저장 
		buffer[ ++position ] = item;
	}

	@Override
	public String pop() throws MyStackEmptyException {
		try{
			// 현재 위치의 값을 리턴하고 top을 하나 줄임
			return buffer[ position-- ];
		}catch(Exception ex){
			throw new MyStackEmptyException("MyStack is Empty");
		}
	}

	// 스택 내부에서만 사용하기 때문에 private
	private void resizeBuffer() {
		// 새버퍼 생성(기존 버퍼의 크기의 2배로 늘림)
		String[] temp = new String[ buffer.length * 2 ]; 

		// 새 버퍼에 복사
		for( int i = 0; i <= position; i++ ) {
			temp[ i ] = buffer[ i ];
		}
		
		// 버퍼를 새로 바꿈
		buffer = temp;
	}
	
	@Override
	public boolean isEmpty() {
		if(position == -1){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return position + 1;
	}

}
