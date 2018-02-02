package lt.hototya.team;

import java.util.ArrayList;
import java.util.List;

import cn.nukkit.Player;
import cn.nukkit.Server;
import lt.hototya.team.event.AddPlayerEvent;
import lt.hototya.team.event.RemovePlayerEvent;
import lt.hototya.team.interfaces.ITeam;

public class Team implements ITeam {

	private String teamName;
	private int maxPlayer;
	private List<String> member = new ArrayList<String>();

	public Team(String teamName, int maxPlayer) {
		this.teamName = teamName;
		this.maxPlayer = maxPlayer;
	}

	@Override
	public boolean addPlayer(Player player) {
		return addPlayer(player.getName(), false);
	}

	@Override
	public boolean addPlayer(Player player, boolean force) {
		return addPlayer(player.getName(), force);
	}

	@Override
	public boolean addPlayer(String player) {
		return addPlayer(player, false);
	}

	@Override
	public boolean addPlayer(String player, boolean force) {
		AddPlayerEvent event = new AddPlayerEvent(player, this);
		Server.getInstance().getPluginManager().callEvent(event);
		if (!force) {
			if (!event.isCancelled() && getPlayers().size() < getMaxPlayer()) {
				return member.add(player);
			} else {
				return false;
			}
		} else {
			member.add(player);
			return true;
		}
	}

	@Override
	public boolean containsPlayer(Player player) {
		return containsPlayer(player.getName());
	}

	@Override
	public boolean containsPlayer(String player) {
		return member.contains(player);
	}

	@Override
	public int getMaxPlayer() {
		return maxPlayer;
	}

	@Override
	public List<String> getPlayers() {
		return member;
	}

	@Override
	public String getTeamName() {
		return teamName;
	}

	@Override
	public boolean removeAllMember() {
		for (String player : getPlayers()) {
			removePlayer(player);
		}
		return member.isEmpty();
	}

	@Override
	public boolean removeAllMember(boolean force) {
		for (String player : getPlayers()) {
			removePlayer(player, force);
		}
		return member.isEmpty();
	}

	@Override
	public boolean removePlayer(Player player) {
		return removePlayer(player.getName(), false);
	}

	@Override
	public boolean removePlayer(Player player, boolean force) {
		return removePlayer(player.getName(), force);
	}

	@Override
	public boolean removePlayer(String player) {
		return removePlayer(player, false);
	}

	@Override
	public boolean removePlayer(String player, boolean force) {
		RemovePlayerEvent event = new RemovePlayerEvent(player, this);
		Server.getInstance().getPluginManager().callEvent(event);
		if (!force) {
			if (!event.isCancelled()) {
				return member.remove(player);
			} else {
				return false;
			}
		} else {
			member.remove(player);
			return true;
		}
	}

	@Override
	public void setMaxPlayer(int max) {
		maxPlayer = max;

	}

	@Override
	public void setTeamName(String name) {
		teamName = name;
	}
}
