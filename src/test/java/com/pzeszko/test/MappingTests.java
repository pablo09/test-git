package com.pzeszko.test;

import com.pzeszko.MyApplication;
import com.pzeszko.model.school.*;
import com.pzeszko.repository.AddressRepository;
import com.pzeszko.repository.SchoolRepository;
import com.pzeszko.repository.StudentRepository;
import com.pzeszko.repository.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Admin on 10.05.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
@WebAppConfiguration
public class MappingTests {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private com.pzeszko.repository.ClassRepository classRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Test
    @Transactional
    public void deleteTeacher() {
        Teacher teacher = teacherRepository.findOne(1L);
        List<School> schools = schoolRepository.findAll();

        schools.stream().filter(s -> s.getTeachers().contains(teacher)).forEach(s -> s.dismissTeacher(teacher));

        teacherRepository.delete(teacher);

        List<Teacher> teachers = teacherRepository.findAll();
        List<Student> students = studentRepository.findAll();
        List<Clazz> classes = classRepository.findAll();
        List<Address> addresses = addressRepository.findAll();

        assertEquals(3, teachers.size());
        assertEquals(2, schools.size());
        assertEquals(8, students.size());
        assertEquals(4, classes.size());
        assertEquals(4, addresses.size());
    }

    @Test
    @Transactional
    public void deleteSchool() {
        School school = schoolRepository.findOne(1L);
        schoolRepository.delete(school);

        List<Clazz> classes = classRepository.findAll();
        List<School> schools = schoolRepository.findAll();
        List<Teacher> teachers = teacherRepository.findAll();
        List<Student> students = studentRepository.findAll();
        List<Address> addresses = addressRepository.findAll();

        assertEquals(4, teachers.size());
        assertEquals(1, schools.size());
        assertEquals(8, students.size());
        assertEquals(2, classes.size());
        assertEquals(4, addresses.size());
    }

    @Test
    @Transactional
    public void deleteStudent() {
        Student student = studentRepository.findOne(1L);
        studentRepository.delete(student);

        List<Clazz> classes = classRepository.findAll();
        List<School> schools = schoolRepository.findAll();
        List<Teacher> teachers = teacherRepository.findAll();
        List<Student> students = studentRepository.findAll();
        List<Address> addresses = addressRepository.findAll();

        assertEquals(4, teachers.size());
        assertEquals(2, schools.size());
        assertEquals(7, students.size());
        assertEquals(4, classes.size());
        assertEquals(4, addresses.size());
    }

    @Test
    @Transactional
    public void deleteClazz() {
        Clazz clazz = classRepository.findOne("1A");
        classRepository.delete(clazz);

        List<Clazz> classes = classRepository.findAll();
        List<School> schools = schoolRepository.findAll();
        List<Teacher> teachers = teacherRepository.findAll();
        List<Student> students = studentRepository.findAll();
        List<Address> addresses = addressRepository.findAll();

        assertEquals(4, teachers.size());
        assertEquals(2, schools.size());
        assertEquals(8, students.size());
        assertEquals(3, classes.size());
        assertEquals(4, addresses.size());
    }

    @Test
    @Transactional
    public void deleteOrphans() {
        School school = schoolRepository.findOne(1L);
        school.getClasses().clear();

        School newSchool = schoolRepository.saveAndFlush(school);
        assertEquals(0, newSchool.getClasses().size());
    }

    @Test
    @Transactional
    public void deleteAddress() {
        Address address = addressRepository.findOne(1L);
//        Stream<School> schoolStream = schoolRepository.findByAddress(address);
//        schoolStream.forEach(s -> s.setAddress(null));
        schoolRepository.removeAddressReferences(address);
        addressRepository.delete(address);

        List<Clazz> classes = classRepository.findAll();
        List<School> schools = schoolRepository.findAll();
        List<Teacher> teachers = teacherRepository.findAll();
        List<Student> students = studentRepository.findAll();
        List<Address> addresses = addressRepository.findAll();

        assertEquals(4, teachers.size());
        assertEquals(2, schools.size());
        assertEquals(8, students.size());
        assertEquals(4, classes.size());
        assertEquals(3, addresses.size());
    }

}
