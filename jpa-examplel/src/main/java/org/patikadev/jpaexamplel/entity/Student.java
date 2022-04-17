package org.patikadev.jpaexamplel.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
//@Table(name="Student")
// @AllArgsConstructor
// @RequiredArgsConstructor > private final olanlar varsa onlar için oluştur
// @NoArgsConstructor //> constructor olmayanlara
public class Student extends BaseId{
    //1-NO args constructor olmak zorunda bir pojo clasının entity olması için
    //hbernate tablolar ile satırları oluşturma kniçin  nesne oluşturuyor setter ile yerleştiriyor, bu nesneler runtime da student.clss.newInstance() oluşturuyor. eğer eklenmese bunu oluşturamaz
    //2 @ID anatosyonu kullanılmalı
    //3 Defaultta getter setter olmalı
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //Bu id otomatik üretildiğini gösterir. Identity database oto yapsın artışı
//    @Column(name="STUDENT_ID")
    private long id;

    @Column(name="STUDENT_NUMBER")
    private long number;
    @Column(name="STUDENT_NAME")
    private String name;
    @Column(name="STUDENT_LAST_NAME")
    private String lastName;
//    @Enumerated(EnumType.STRING)
    private String department;
//    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @OneToOne(optional = false) //optional = false adresi olmayan bi öğrencci olmamalı demek
    //mappedBy = "studentAddress" idyi studentAddress üzerinde tutacak
    private StudentAddress studentAddress;

    @ManyToMany
    //Set Collection farkı
    private Set<Course> courses= new HashSet<>();

    //student adresi setleme işlemei
    public void addStudentAddress() {
        this.studentAddress=studentAddress;
    }
}
