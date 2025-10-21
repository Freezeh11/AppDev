package com.appdev.teamname.espelitag6.Service;

import com.appdev.teamname.espelitag6.Entity.Subject;
import com.appdev.teamname.espelitag6.Repository.SubjectRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject updateSubject(Long id, Subject updatedSubject) {
        Subject subject = getSubjectById(id);
        if (subject != null) {
            subject.setSubjectName(updatedSubject.getSubjectName());
            subject.setInstructorName(updatedSubject.getInstructorName());
            subject.setPassword(updatedSubject.getPassword());
            subject.setSemester(updatedSubject.getSemester());
            return subjectRepository.save(subject);
        }
        return null;
    }

    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }
}
