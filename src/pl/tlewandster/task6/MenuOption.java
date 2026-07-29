package pl.tlewandster.task6;

public enum MenuOption {
    START("Started"), STOP("Stopped"), EXIT("Exited");

    private final String action;

    MenuOption(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
