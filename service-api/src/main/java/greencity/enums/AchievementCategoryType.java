package greencity.enums;

import lombok.Getter;

@Getter
public enum AchievementCategoryType {
    ECO_NEWS("EcoNews"),
    ECO_NEWS_COMMENT("EcoNewsComments"),
    ECO_NEWS_LIKE("EcoNewsLikes"),
    ACHIEVEMENTS("Achievements"),
    HABIT_STREAK("HabitStreak"),
    ACQUIRED_HABIT("AcquiredHabits");

    private final String category;

    AchievementCategoryType(String category) {
        this.category = category;
    }
}
