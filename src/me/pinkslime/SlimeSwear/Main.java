package me.pinkslime.SlimeSwear;

import org.spongepowered.api.entity.Player;
import org.spongepowered.api.event.Subscribe;
import org.spongepowered.api.event.player.PlayerChatEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id="SlimeSwear", name="SlimeSwear", version="1.0.0-SNAPSHOT")
public class Main {
	
	@Subscribe
	public void chatEvent(PlayerChatEvent e) {
		
		String msg = e.getMessage();
		Player player = e.getPlayer();
		
		player.sendMessage("[SlimeSwear] Please watch your language in future.");
		
		msg = msg.replaceAll("(?i)arsehole|asshole", "Elephant and Castle");
		msg = msg.replaceAll("(?i)arse|ass", "Bottle and Glass");
		msg = msg.replaceAll("(?i)balls", "Niagra Falls");
		msg = msg.replaceAll("(?i)bitch", "Miss Fitch");
		msg = msg.replaceAll("(?i)bum", "Kingdom Come");
		msg = msg.replaceAll("(?i)cock", "Brighton Rock");
		msg = msg.replaceAll("(?i)crap", "Von Trappe");
		msg = msg.replaceAll("(?i)cum", "Bubble Gum");
		msg = msg.replaceAll("(?i)cunt", "Berkeley Hunt");
		msg = msg.replaceAll("(?i)dick", "Rock and Stick");
		msg = msg.replaceAll("(?i)dump", "Donald Trump");
		msg = msg.replaceAll("(?i)fanny", "Jack and Danny");
		msg = msg.replaceAll("(?i)fart", "Raspberry Tart");
		msg = msg.replaceAll("(?i)fucker", "Feather Plucker");
		msg = msg.replaceAll("(?i)fuck", "Friar Tuck");
		msg = msg.replaceAll("(?i)pissed", "Oliver Twist");
		msg = msg.replaceAll("(?i)piss", "Hit and Miss");
		msg = msg.replaceAll("(?i)prick", "Hampton Wick");
		msg = msg.replaceAll("(?i)pube", "Rubik's Cube");
		msg = msg.replaceAll("(?i)shitter", "Gary Glitter");
		msg = msg.replaceAll("(?i)shite", "Turkish Delight");
		msg = msg.replaceAll("(?i)shits", "Two Bob Bits");
		msg = msg.replaceAll("(?i)shit", "Brad Pitt");
		msg = msg.replaceAll("(?i)spunk", "Harry Monk");
		msg = msg.replaceAll("(?i)tits", "Brace and Bits");
		msg = msg.replaceAll("(?i)titty", "Bristol City");
		msg = msg.replaceAll("(?i)turd", "Douglas Hurd");
		msg = msg.replaceAll("(?i)wanker", "Merchant Banker");
		msg = msg.replaceAll("(?i)wank", "Sherman Tank");
				
		// e.setMessage(msg);  Awaiting this method...
	}
	
}
