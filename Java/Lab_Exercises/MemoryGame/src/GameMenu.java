public class GameMenu {
    // Player's menu selections
    protected final String nameOfPlayer;
    private final LevelOption levelOption;
    private final CardOption cardOption;

    public GameMenu (String nameOfPlayer, LevelOption levelOption, CardOption cardOption) {
        this.nameOfPlayer = nameOfPlayer;
        this.levelOption = levelOption;
        this.cardOption = cardOption;

    }

    // Getters to retrieve player's menu selections
    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public LevelOption getLevelOption() {
        return levelOption;
    }

    public CardOption getCardOption() {
        return cardOption;
    }
}