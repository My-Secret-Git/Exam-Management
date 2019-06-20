package com.pojo;

public class Question {
    private Integer questionID;

    private String subject;

    private String choiceA;

    private String choiceB;

    private String choiceC;

    private String choiceD;

    private String answer;

    private String typeID;

    private String courseID;

    private String courseName;
    
    
    public Question( String subject, String choiceA, String choiceB, String choiceC, String choiceD,
			String answer, String typeID, String courseID) {
		super();
		
		this.subject = subject;
		this.choiceA = choiceA;
		this.choiceB = choiceB;
		this.choiceC = choiceC;
		this.choiceD = choiceD;
		this.answer = answer;
		this.typeID = typeID;
		this.courseID = courseID;
	}

	public Question() {
		super();
	}

	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA == null ? null : choiceA.trim();
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB == null ? null : choiceB.trim();
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC == null ? null : choiceC.trim();
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD == null ? null : choiceD.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID == null ? null : typeID.trim();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID == null ? null : courseID.trim();
    }
}