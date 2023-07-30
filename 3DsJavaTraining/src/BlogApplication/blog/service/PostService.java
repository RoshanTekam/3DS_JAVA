package BlogApplication.blog.service;

import BlogApplication.blog.entities.PostEntity;

public interface PostService {
	void printPost();

	void createPost(PostEntity post);

	void updatePost(PostEntity post);

	void deletePost();

	boolean checkDuplicateData(PostEntity post);

}
