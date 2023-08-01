package greencity.dto.comment;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentAdminDto {
    private Long id;
    private String text;
    private LocalDateTime createdDate;
}
