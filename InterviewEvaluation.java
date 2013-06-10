import java.util.GregorianCalendar;


public class InterviewEvaluation {
	//Attributes
	protected String interviewerFirstName;
	protected String interviewerLastName;
	protected String evaluationFileID;
	protected GregorianCalendar updateTime;
	
	//Constructors
	public InterviewEvaluation(GregorianCalendar update){
		updateTime = update;
	}
	
	public InterviewEvaluation(String firstName, String lastName, GregorianCalendar update){
		interviewerFirstName = firstName;
		interviewerFirstName = lastName;
		updateTime = update;
	}
	
	public InterviewEvaluation(String firstName, String lastName, String fileId, GregorianCalendar update){
		interviewerFirstName = firstName;
		interviewerLastName = lastName;
		evaluationFileID = fileId;
		updateTime = update;
	}
	
	//Methods
	public String getInterviewerFirstName(){
		return interviewerFirstName;
	}
	
	public void setInterviewerFirstName(String x){
		interviewerFirstName = x;
	}
	
	public String getInterviewerLastName(){
		return interviewerLastName;
	}
	
	public void setInterviewerLastName(String x){
		interviewerLastName = x;
	}
	
	public String getEvaluationFileID(){
		return evaluationFileID;
	}
	
	public void setEvaluationFileID(String x){
		evaluationFileID = x;
	}
	
	public GregorianCalendar getUpdateTime(){
		return updateTime;
	}
	
}
