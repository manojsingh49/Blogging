package com.multiplexmoments.blog.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	@Id
    @Column(name = "postid")
    private Integer postId;

    @Column(name = "posttitle")
    private String postTitle;

    @Column(name = "content")
    private String content;

    @Column(name = "create_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "categoryid")
    private int categoryId;

    @Column(name = "userid")
    private int userId;

    @Column(name = "adminid")
    private int adminId;

}
