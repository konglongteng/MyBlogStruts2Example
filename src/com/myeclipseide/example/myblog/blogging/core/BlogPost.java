package com.myeclipseide.example.myblog.blogging.core;

public class BlogPost {

	private String subject;

	private String content;

	public BlogPost(String subject, String content) {
		this.subject = subject;
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
