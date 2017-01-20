package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Luke Hardman on 01/12/16.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {
}
