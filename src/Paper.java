import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Qpaper
{
	private Set Qpset;
	private String subject;
	private char setCode;
	public Set getQpset() {
		return Qpset;
	}
	public void setQpset(Set qpset) {
		Qpset = qpset;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public char getSetCode() {
		return setCode;
	}
	public void setSetCode(char setCode) {
		this.setCode = setCode;
	}
	
}
class Question
{
	private int qno;
	private String question;
	private difficultylevel QPlevel=difficultylevel.EASY;
	private ArrayList answerList;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public difficultylevel getQPlevel() {
		return QPlevel;
	}
	public void setQPlevel(difficultylevel qPlevel) {
		QPlevel = qPlevel;
	}
	public ArrayList getAnswerList() {
		return answerList;
	}
	public void setAnswerList(ArrayList answerList) {
		this.answerList = answerList;
	}
	
}

public class Paper {

	public static void main(String[] args) {
		Qpaper qp=new Qpaper();
		
		qp.setSubject("java");
		qp.setSetCode('c');
		Set<Question> myset=new HashSet<>();
		Question q=new Question();
		q.setQno(1);
		q.setAnswerList(null);
		q.setQuestion("how to prevent inheritance in java");
		q.setQPLevel(difficultylevel.EASY);
		
		

	}

}
