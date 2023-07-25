package greencity.service;

import greencity.dto.user.UserVO;
import greencity.dto.useraction.UserActionVO;

public interface UserActionService {
    /**
     * Method updates {@link UserActionVO}.
     *
     * @param userActionVO {@link UserActionVO}
     * @return {@link UserActionVO}
     * @author Orest Mamchuk
     */
    UserActionVO updateUserActions(UserActionVO userActionVO);

    /**
     * Method saves {@link UserActionVO}.
     *
     * @param userActionVO {@link UserActionVO}
     * @return {@link UserActionVO}
     * @author Orest Mamchuk
     */
    UserActionVO save(UserActionVO userActionVO);
}
