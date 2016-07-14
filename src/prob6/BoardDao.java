package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		
		// Database에서 데이터를 가져와서
		// Board 객체를 만들고 리스트에 저장
		for(int i = 0; i < 3; i++){
			Board board = new Board();
			board.setTitle("제목" + (i+1));
			board.setContent("내용" + (i+1));
			list.add(board);
		}
		
		return list;
	}
	
}
