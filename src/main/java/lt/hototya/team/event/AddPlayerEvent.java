package lt.hototya.team.event;

import cn.nukkit.event.Cancellable;
import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;
import lt.hototya.team.Team;

public class AddPlayerEvent extends Event implements Cancellable {

	public static final HandlerList hanlers = new HandlerList();

	private String player;
	private Team team;

	public AddPlayerEvent(String player, Team team) {
		this.player = player;
		this.team = team;
	}

	public String getPlayer() {
		return player;
	}

	public Team getTeam() {
		return team;
	}

	public static HandlerList getHandlers() {
		return hanlers;
	}
}
