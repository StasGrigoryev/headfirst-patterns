package org.example.patterns.command;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor gd;

    public GarageDoorOpenCommand (GarageDoor gd) {
        this.gd = gd;
    }

    @Override
    public void execute() {
        gd.up();
    }
}
