package com.philcoding.blog.service;

import com.philcoding.blog.model.blog.BlogDTO;
import com.philcoding.blog.model.blog.BlogPageDTO;
import com.philcoding.blog.model.pageable.PageDTO;

import java.util.List;

public interface BlogService {

    BlogPageDTO findByPage(PageDTO pageDTO);

    BlogDTO findById(Long blogId);

    BlogDTO create(BlogDTO blogDTO);

    BlogDTO update(BlogDTO blogDTO);

    void delete(Long blogId);
}
