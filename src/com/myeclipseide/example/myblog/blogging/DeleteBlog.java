package com.myeclipseide.example.myblog.blogging;

import java.util.List;

import com.myeclipseide.example.myblog.blogging.core.BlogPost;
import com.myeclipseide.example.myblog.blogging.core.BlogStore;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteBlog extends ActionSupport {

	private String title;

	private List<BlogPost> blogs;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<BlogPost> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<BlogPost> blogs) {
		this.blogs = blogs;
	}

	public String execute() {
		BlogStore.store.removeBlog(title);
		setBlogs(BlogStore.store.getBlogs());
		return SUCCESS; 
	}
}