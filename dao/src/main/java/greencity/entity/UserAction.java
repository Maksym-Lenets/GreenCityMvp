package greencity.entity;

import lombok.*;

import javax.persistence.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_actions")
@Builder
@EqualsAndHashCode
public class UserAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Column(name = "count")
    private Integer count = 0;
}
