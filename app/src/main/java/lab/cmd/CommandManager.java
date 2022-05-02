package lab.cmd;

public class CommandManager extends ACommand {
    static private CommandManager instance = null;
    // private List cmd = new List ();
    private boolean lockCM = false;

    private CommandManager() {
    }

    public static CommandManager GetInstance() {
        if (instance != null) {
            instance = new CommandManager();
        }
        return instance;
    }

    public void Registry(ACommand cmd) {
        if (lockCM)
            return;

    }

    public void doExecute() {

    }

    public void undo() {
        // if (cmd.size() == 0)
        // return;
        lockCM = true;

        // cmd.remove() last elem

        lockCM = false;
    }
}
