package com.example.service;

import com.example.domain.Note;
import com.example.domain.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
<<<<<<< HEAD
 * Created by Luke Hardman on 01/12/16.
=======
 * Created by Louie Qin on 01/12/16.
>>>>>>> 9fa015fd5af7fd4ac8079492f2d825755a0a5801
 */
@Service
public class NoteService {
    @Autowired
    protected  NoteRepository noteRepository;

    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public void delete(Note note) { noteRepository.delete(note); }
}
