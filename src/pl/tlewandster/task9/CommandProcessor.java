package pl.tlewandster.task9;

final class CommandProcessor {
    static void processCommand(String cmd) {
        switch (cmd) {
            case "ARG":
                throw new IllegalArgumentException("Bad argument");
            case "STATE":
                throw new IllegalStateException("Bad state");
        }
    }

    static void demo() {
        try {
            processCommand(Math.random() > 0.5 ? "ARG" : "STATE");
        } catch (Exception e) {
            System.out.println("Problem. " + e.getMessage());;
        }
    }
}