package com.fclau.blog.service;

import com.fclau.blog.po.Comment;

import java.util.List;

/**
 * Created by Edward on 2018/8/9
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}