package com.tts.SpringBootIntro.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class feedback {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
	private Long id;
	
    private String emailAddress;
    private String feedback;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	} 
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Email Address=" + emailAddress + ", feedback=" + feedback + "]";
	}
    
    
}
