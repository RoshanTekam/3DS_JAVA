package BlogApplication.blog.controller;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

import BlogApplication.blog.entities.PostEntity;
import BlogApplication.blog.exception.DuplicateDateException;
import BlogApplication.blog.service.PostServiceImpl;

public class PostController {

	public static void main(String[] args) {
		PostCreate create = new PostCreate();
		Thread t1 = new Thread(create);
		Thread t2 = new Thread(create);
		t1.start();
		t2.start();

	}

}

class PostCreate extends Thread {
	PostEntity post = new PostEntity();
	PostServiceImpl postServiceImpl = new PostServiceImpl();
	Scanner sc = new Scanner(System.in);

	public void run() {
		try {
			this.action();
		} catch (DuplicateDateException e) {
			e.printStackTrace();
		}

	}

	public synchronized void action() throws DuplicateDateException {
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
				System.out.println("Enter post id : ");
				int id = sc.nextInt();
				post.setPostId(id);

				System.out.println("Enter post title : ");
				String name = sc.next();
				post.setTitle(name);

				System.out.println("Enter post content : ");
				String con = sc.next();
				post.setContent(con);

				if (!postServiceImpl.checkDuplicateData(post)) {
					System.out.println("This is duplicate checker/...");
					postServiceImpl.createPost(post);
				} else {
					throw new DuplicateDateException("Duplicate data found ...");
				}
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
