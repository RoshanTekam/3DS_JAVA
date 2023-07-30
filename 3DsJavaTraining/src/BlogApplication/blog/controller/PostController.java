package BlogApplication.blog.controller;

import java.util.Scanner;

import BlogApplication.blog.entities.PostEntity;
import BlogApplication.blog.service.PostServiceImpl;

public class PostController {

	public static void main(String[] args) {

		PostEntity post = new PostEntity();
		PostServiceImpl postServiceImpl = new PostServiceImpl();

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("What you want to perform print,insert,update,delete..");
			String action = sc.next();
			switch (action) {
			case "print": {
				postServiceImpl.printPost();
				continue;
			}
			case "insert": {
				postServiceImpl.createPost(post);
				continue;
			}
			case "update": {
				postServiceImpl.updatePost(post);
				continue;
			}
			case "delete": {
				postServiceImpl.deletePost();
				continue;
			}
			case "end": {
				flag = false;
				System.out.println("Action end ....");
				break;
			}
			default:
				System.out.println("Enter right keyword ....");
				continue;
			}
		}

	}

}
