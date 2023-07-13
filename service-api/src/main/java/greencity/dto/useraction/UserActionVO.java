package greencity.dto.useraction;

import greencity.dto.user.UserVO;
import lombok.*;

@EqualsAndHashCode
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserActionVO {
    private Long id;

    private UserVO user;

    private Integer count = 0;
}
