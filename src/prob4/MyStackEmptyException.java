package prob4;

public class MyStackEmptyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackEmptyException(){
		super();
	}
	
	public MyStackEmptyException(String message){
		super(message);
	}
	
//	.
//	java
//	!!!
//	World
//	Hello
//	Hello
//	error:prob4.MyStackEmptyException: MyStack is Empty
}
