package my.home.microservicepractiseapi.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project")
@ConfigurationProperties(prefix = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;


    private Instant createdAt = Instant.now();


    @OneToMany(fetch = FetchType.LAZY)
    private List<TaskStateEntity> taskStates = new ArrayList<>();

    //Getters
    public Instant getCreatedAt() {
        return createdAt;

    }

    public Long getId() {
        return id;
    }

    public List<TaskStateEntity> getTaskStates() {
        return taskStates;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskStates(List<TaskStateEntity> taskStates) {
        this.taskStates = taskStates;
    }


}
