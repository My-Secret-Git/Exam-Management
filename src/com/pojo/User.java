package com.pojo;

public class User {
    private String userID;

    private String userName;

    private String password;

    private String email;

    private String userType;

    private String photo;

    private String bjdh;

    
    
    public User() {
		super();
	}

	

    public User(String userID, String userName, String bjdh) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.bjdh = bjdh;
	}

    
	public User(String userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}

	public String getUserID() {
        return userID;
    }
	
	public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getBjdh() {
        return bjdh;
    }

    public void setBjdh(String bjdh) {
        this.bjdh = bjdh == null ? null : bjdh.trim();
    }
}