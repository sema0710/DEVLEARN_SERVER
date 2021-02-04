package sema.DEVLEARN.entities.post;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private Integer id;

    private String description;

    private String content;

    private String title;
}
