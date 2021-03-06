import org.osbot.rs07.api.filter.Filter;
import org.osbot.rs07.api.model.Player;

import org.osbot.rs07.script.Script;

import org.osbot.rs07.script.ScriptManifest;

import java.awt.*;
import java.util.Random;

@ScriptManifest(name = "Nerd_Watcher", author = "Jacob", version = 1.0, info = "", logo = "")
public class main extends Script {

	Player player;
	Random rand = new Random();

	@Override
	public void onStart() {

		// Code here will execute before the loop is started

	}

	@Override
	public void onExit() {

		// Code here will execute after the script ends

	}

	@Override
	public int onLoop() {
		//if player is null, getClosestPlayer
		if(player == null){
			player = getClosestPlayer();
			player.interact("Follow");
		}
		
		// If player cannot be found getClosestPlayer
		if (!player.isVisible()) {
			log("Lost Target");
			player = getClosestPlayer();
			player.interact("Follow");
		}

		log("Following" + player.getName());

		int randomNumber = (rand.nextInt(10000 - 600 + 1) + 600);

		return randomNumber; // The amount of time in milliseconds before the
								// loop starts over

	}

	public Player getClosestPlayer() {

		Player closest = getPlayers().closest(new Filter<Player>() {

			public boolean match(Player p) {

				return p != null && !p.equals(myPlayer());

			}

		});

		return closest;
	}

}