package com.myeclipseide.example.myblog.blogging;

import com.myeclipseide.example.myblog.blogging.core.BlogPost;
import com.myeclipseide.example.myblog.blogging.core.BlogStore;
import com.opensymphony.xwork2.ActionSupport;

public class PublishBlogPost extends ActionSupport {

	private String subject;

	private String content;

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

	public String execute() {
		BlogStore.store.storeBlog(new BlogPost(subject, content));
		return SUCCESS;
	}
}