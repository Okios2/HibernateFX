package Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "section", schema = "teachermansystem")
public class SectionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "GroupName")
    private String groupName;
    @Basic
    @Column(name = "GroupLimit")
    private int groupLimit;

    @Override
    public String toString(){
        return groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupLimit() {
        return groupLimit;
    }

    public void setGroupLimit(int groupLimit) {
        this.groupLimit = groupLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SectionEntity that = (SectionEntity) o;
        return id == that.id && groupLimit == that.groupLimit && Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName, groupLimit);
    }
}
