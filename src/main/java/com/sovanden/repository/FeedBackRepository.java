package com.sovanden.repository;

import com.sovanden.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedBackRepository extends JpaRepository<Feedback,Long> {
}
