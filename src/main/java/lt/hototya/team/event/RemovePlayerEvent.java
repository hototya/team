package lt.hototya.team.event;

import cn.nukkit.event.Cancellable;
import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;
import lt.hototya.team.Team;

public class RemovePlayerEvent extends Event implements Cancellable {

	public static final HandlerList handlers = new HandlerList();

	private String player;
	private Team team;

	public RemovePlayerEvent(String player, Team team) {
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
		return handlers;
	}
}
