package greencity.message;

import greencity.dto.user.PlaceAuthorDto;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@Builder
public class SendReportEmailMessage implements Serializable {
    private List<PlaceAuthorDto> subscribers;
    private String emailNotification;
}
