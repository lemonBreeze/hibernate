package Classes;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "person_table")
public class Person implements Serializable
{
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    private int id;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
