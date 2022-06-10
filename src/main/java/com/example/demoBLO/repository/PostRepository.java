package com.example.demoBLO.repository;

import com.example.demoBLO.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Collection<Post> findAllByOrderByCreationDateDesc();

    Page<Post> findAllByOrderByCreationDateDesc(Pageable pageable);

    Optional<Post> findById(Long id);
}