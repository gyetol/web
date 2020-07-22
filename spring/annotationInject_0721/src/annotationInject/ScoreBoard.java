package annotationInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class ScoreBoard {
	@Autowired
	@Qualifier("lectureTest")
	private LectureTest test;
	
	public void print() {
		System.out.println("국어: "+test.getKor());
		System.out.println("영어: "+test.getEng());
		System.out.println("수학: "+test.getMath());
	}
}
