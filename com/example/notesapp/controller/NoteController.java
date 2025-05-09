package com.example.notesapp.controller;

import com.example.notesapp.model.*;
import com.example.notesapp.repository.*;

import java.util.List;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/notes")
public class NoteController {
	
	private final NoteRepository repository;

	public NoteController(NoteRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<Note> getAllNotes() {
		return repository.findAll();
	}
	
	@PostMapping
	public Note createNote(@RequestBody Note note) {
		return repository.save(note);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
