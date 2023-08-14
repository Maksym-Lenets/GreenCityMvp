package greencity.message;

import greencity.dto.econews.AddEcoNewsDtoResponse;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Message, that is used for sending emails about adding new eco news.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddEcoNewsMessage implements Serializable {
    private AddEcoNewsDtoResponse addEcoNewsDtoResponse;
}
