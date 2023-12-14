package Entity;

import com.example.hibernatefxagain.TeacherCondition;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "teachers", schema = "teachermansystem")
public class TeachersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Surname")
    private String surname;
    @Basic
    @Column(name = "DateOfBirth")
    private int dateOfBirth;
    @Basic
    @Column(name = "Compensation")
    private double compensation;
    @Basic
    @Column(name = "GroupId")
    private int groupId;
    @Basic
    @Column(name = "TeacherCondition")
    private Object condition;
//    @ManyToOne
//    @JoinColumn(name = "GroupId", referencedColumnName = "id", nullable = false)
//    private SectionEntity sectionByGroupId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Object getCondition() {
        return condition;
    }

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeachersEntity that = (TeachersEntity) o;
        return id == that.id && dateOfBirth == that.dateOfBirth && Double.compare(compensation, that.compensation) == 0 && groupId == that.groupId && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, dateOfBirth, compensation, groupId, condition);
    }

//    public SectionEntity getSectionByGroupId() {
//        return sectionByGroupId;
//    }

//    public void setSectionByGroupId(SectionEntity sectionByGroupId) {
//        this.sectionByGroupId = sectionByGroupId;
//    }
}
