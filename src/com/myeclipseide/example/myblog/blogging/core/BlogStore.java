/**
 * 
 */
package com.myeclipseide.example.myblog.blogging.core;

import java.util.ArrayList;
import java.util.List;

public class BlogStore {

	public static final BlogStore store = new BlogStore();

	private List<BlogPost> blogs = new ArrayList<BlogPost>();

	protected BlogStore() {
	}

	public List<BlogPost> getBlogs() {
		return blogs;
	}

	public void storeBlog(BlogPost newPost) {
		blogs.add(newPost);
	}
	
	private BlogPost getBlogPost(String subject) {
		for (BlogPost blogPost : blogs) {
			if (blogPost.getSubject().equals(subject)) {
				return blogPost;
			}
		}
		return null;
	}
	
	public void removeBlog(Object subject) {
		BlogPost postToRemove = getBlogPost((String) subject);
		if (postToRemove != null) {
			blogs.remove(postToRemove);
		}
	}

}
