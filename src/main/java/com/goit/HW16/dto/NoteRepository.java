package com.goit.HW16.dto;

import com.goit.HW16.service.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository <Note, Long> {

}
