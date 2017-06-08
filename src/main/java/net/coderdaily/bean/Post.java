package net.coderdaily.bean;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;

public class Post {
	private String id;
	@Indexed(unique = true)
	private String title;
	private String content;
	private Date date;
	private List comments;

	public Post(String title, Date date) {
		this.title = title;
		this.date = date;
	}

	public Post() {
		super();
	}

	public Post(String title, String content, Date date) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List getComments() {
		return comments;
	}

	public void setComments(List comments) {
		this.comments = comments;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", date=" + date + ", comments="
				+ comments + "]";
	}

}
