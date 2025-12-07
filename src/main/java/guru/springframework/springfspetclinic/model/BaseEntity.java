package guru.springframework.springfspetclinic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
<<<<<<< Updated upstream
public class BaseEntity {
=======
public abstract class BaseEntity {
>>>>>>> Stashed changes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

<<<<<<< Updated upstream
=======
    public Integer getId() {
        return id;
    }

>>>>>>> Stashed changes
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonIgnore
    public boolean isNew() {
        return this.id == null;
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
