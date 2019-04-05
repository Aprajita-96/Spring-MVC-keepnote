package com.stackroute.keepnote.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.stackroute.keepnote.model.Note;

/*
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */

public class NoteRepository {
	List<Note> note = null;

	/* Declare a variable called "list" to store all the notes. */

	public NoteRepository() {

		note = new ArrayList<Note>();
		/* Initialize the variable using proper data type */
	}

	/* This method should return all the notes in the list */

	public List<Note> getList() {
		return note;
	}

	/* This method should set the list variable with new list of notes */

	public void setList(List<Note> list) {
		this.note = list;

	}

	/*
	 * This method should Note object as argument and add the new note object into
	 * list
	 */

	public void addNote(Note note) {
		this.note.add(note);

	}

	/* This method should deleted a specified note from the list */

	public boolean deleteNote(int noteId) {
		Iterator<Note> it = note.iterator();
		while (it.hasNext()) {

			Note no = it.next();
			if (no.getNoteId() == noteId) {
				note.remove(no);
				return true;
			}


		}
		/* Use list iterator to find matching note id and remove it from the list */
		return false;


	}

	/* This method should return the list of notes */

	public List<Note> getAllNotes() {
		return note;
	}

	/*
	 * This method should check if the matching note id present in the list or not.
	 * Return true if note id exists in the list or return false if note id does not
	 * exists in the list
	 */

	public boolean exists(int noteId) {

		Iterator<Note> it = note.iterator();
		while (it.hasNext()) {

			Note no = it.next();
			if (no.getNoteId() == noteId) {
				return true;
			}

		}
		return false;
	}
}