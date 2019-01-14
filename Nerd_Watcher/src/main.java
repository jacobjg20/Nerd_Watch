import org.osbot.rs07.script.Script;

import org.osbot.rs07.script.ScriptManifest;

import java.awt.*;

@ScriptManifest(name = "Nerd_Watcher", author = "Jacob", version = 1.0, info = "", logo = "") 

public class main extends Script {

    @Override

    public void onStart() {

        //Code here will execute before the loop is started

    }

    

    @Override

    public void onExit() {

        //Code here will execute after the script ends

    }

    @Override

    public int onLoop() {

        return 100; //The amount of time in milliseconds before the loop starts over

    }


}