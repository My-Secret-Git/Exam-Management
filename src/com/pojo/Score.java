package com.pojo;

public class Score {
    private Integer id;

    private String userID;

    private String courseID;
    
    private String courseName;

    private Integer cj;

    private Integer pscj;

    private Integer kscj;
    
    private String userName;

    
    
    public Score() {
		super();
	}

    
    
    
	public String getCourseName() {
		return courseName;
	}




	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}




	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID == null ? null : courseID.trim();
    }

    public Integer getCj() {
        return cj;
    }

    public void setCj(Integer cj) {
        this.cj = cj;
    }

    public Integer getPscj() {
        return pscj;
    }

    public void setPscj(Integer pscj) {
        this.pscj = pscj;
    }

    public Integer getKscj() {
        return kscj;
    }

    public void setKscj(Integer kscj) {
        this.kscj = kscj;
    }



	@Override
	public String toString() {
		return "Score [id=" + id + ", userID=" + userID + ", courseID=" + courseID + ", cj=" + cj + ", pscj=" + pscj
				+ ", kscj=" + kscj + ", userName=" + userName + "]";
	}
    
    
}