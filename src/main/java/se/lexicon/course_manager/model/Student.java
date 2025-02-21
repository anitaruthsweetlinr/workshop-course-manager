package se.lexicon.course_manager.model;

import se.lexicon.course_manager.data.sequencers.StudentSequencer;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    private int id;
    private String name;
    private String email;
    private String address;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, String email, String address) {
        setId(StudentSequencer.nextStudentId());
        setName(name);
        setEmail(email);
        setAddress(address);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if(name == null || name.isEmpty()) throw new IllegalArgumentException("Name was null");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //if(email==null || email.isEmpty()) throw new IllegalArgumentException("Email was null");
        this.email = email;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        //if(address==null || address.isEmpty()) throw new IllegalArgumentException("Address was null");
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }

}