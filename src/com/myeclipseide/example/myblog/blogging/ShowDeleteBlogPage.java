package com.myeclipseide.example.myblog.blogging;

import java.util.List;

import com.myeclipseide.example.myblog.blogging.core.BlogPost;
import com.myeclipseide.example.myblog.blogging.core.BlogStore;
import com.opensymphony.xwork2.ActionSupport;

public class ShowDeleteBlogPage extends ActionSupport {

	private List<BlogPost> blogs;
	
	public List<BlogPost> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<BlogPost> blogs) {
		this.blogs = blogs;
	}
	
	public String execute() {
		setBlogs(BlogStore.store.getBlogs());
		return SUCCESS;
	}
}