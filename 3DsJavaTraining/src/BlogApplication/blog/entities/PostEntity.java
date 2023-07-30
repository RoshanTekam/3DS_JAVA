package BlogApplication.blog.entities;

public class PostEntity {
	private int postId;
	private String title;
	private String content;

	/*
	 * public PostEntity(int postId, String title, String content) { super();
	 * this.postId = postId; this.title = title; this.content = content; }
	 */

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PostEntity [postId=" + postId + ", title=" + title + ", content=" + content + "]";
	}

}
