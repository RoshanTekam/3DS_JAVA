package BlogApplication.blog.service;

import java.util.Scanner;

import BlogApplication.blog.dao.Dao;
import BlogApplication.blog.entities.PostEntity;

public class PostServiceImpl implements PostService {

	Dao dao = new Dao();
	static Scanner scanner = new Scanner(System.in);

	@Override
	public void printPost() {
		dao.printData();

	}

	@Override
	public boolean checkDuplicateData(PostEntity post) {
		return dao.checkDuplicateData(post);
	}

	@Override
	public void createPost(PostEntity post) {

		dao.insertData(post);

	}

	@Override
	public void updatePost(PostEntity post) {
		System.out.println("Which row you want to update ...");
		post.setPostId(scanner.nextInt());

		System.out.println("Insert new title ...");
		post.setTitle(scanner.next());

		System.out.println("Insert new content ...");
		post.setContent(scanner.next());

		dao.updateData(post);

	}

	@Override
	public void deletePost() {
		System.out.println("Insert Id to delete...");
		int id = scanner.nextInt();
		dao.deleteData(id);

	}

}
