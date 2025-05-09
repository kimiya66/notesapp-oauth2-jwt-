package com.example.notesapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.notesapp.model.*;

public interface NoteRepository extends JpaRepository<Note, Long>{
	List<Note> findByCreatedBy(String createdBy);
}
