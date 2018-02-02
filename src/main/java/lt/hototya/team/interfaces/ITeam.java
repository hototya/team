package lt.hototya.team.interfaces;

import java.util.List;

import cn.nukkit.Player;

public interface ITeam {

	/**
	 * このチームに指定のプレイヤーを追加します
	 *
	 *
	 * @param player 追加したいプレイヤーのPlayerオブジェクトのインスタンス
	 * @return 成功した場合はtrue
	 */
	public boolean addPlayer(Player player);

	/**
	 * このチームに指定のプレイヤーを追加します
	 *
	 *
	 * @param player 追加したいプレイヤーのPlayerオブジェクトのインスタンス
	 * @param force 強制的に追加する場合はtrue
	 * @return 成功した場合はtrue
	 */
	public boolean addPlayer(Player player, boolean force);

	/**
	 * このチームに指定のプレイヤーを追加します
	 *
	 * @param player 追加したいプレイヤーの名前
	 * @return 成功した場合はtrue
	 */
	public boolean addPlayer(String player);

	/**
	 * このチームに指定のプレイヤーを追加します
	 *
	 * @param player 追加したいプレイヤーの名前
	 * @param force 強制的に追加する場合はtrue
	 * @return 成功した場合はtrue
	 */
	public boolean addPlayer(String player, boolean force);

	/**
	 * 指定されたプレイヤーがこのチームに入っている場合にtrueを返します
	 *
	 * @param player 調べるプレイヤーのPlayerオブジェクトのインスタンス
	 * @return 指定のプレイヤーがチームに入っている場合はtrue
	 */
	public boolean containsPlayer(Player player);

	/**
	 * 指定されたプレイヤーがこのチームに入っている場合にtrueを返します
	 *
	 * @param player 調べるプレイヤーの名前
	 * @return 指定のプレイヤーがチームに入っている場合はtrue
	 */
	public boolean containsPlayer(String player);

	/**
	 * このチームの上限人数を返します
	 *
	 * @return このチームの上限人数
	 */
	public int getMaxPlayer();

	/**
	 * このチームに入ってるプレイヤー達をListで返します
	 *
	 * @return プレイヤーの名前が入っているListを返します
	 */
	public List<String> getPlayers();

	/**
	 * このチームの名前を返します
	 *
	 * @return このチームの名前*/
	public String getTeamName();

	/**
	 * このチームから全メンバーを削除します
	 *
	 * @return 成功した場合はtrue
	 */
	public boolean removeAllMember();

	/**
	 * このチームから全メンバーを削除します
	 *
	 * @param force 強制的に削除する場合はtrue
	 * @return 成功した場合はtrue
	 */
	public boolean removeAllMember(boolean force);

	/**
	 * このチームから指定のプレイヤーを削除します
	 *
	 * @param player 削除したいプレイヤーのPlayerオブジェクトのインスタンス
	 * @return 成功した場合はtrue
	 */
	public boolean removePlayer(Player player);

	/**
	 * このチームから指定のプレイヤーを削除します
	 *
	 * @param player 削除したいプレイヤーのPlayerオブジェクトのインスタンス
	 * @param force 強制的に削除する場合はtrue
	 * @return 成功した場合はtrue
	 */
	public boolean removePlayer(Player player, boolean force);

	/**
	 * このチームから指定のプレイヤーを削除します
	 *
	 * @param player 削除したいプレイヤーの名前
	 * @return 成功した場合はtrue
	 */
	public boolean removePlayer(String player);

	/**
	 * このチームから指定のプレイヤーを削除します
	 *
	 * @param player 削除したいプレイヤーの名前
	 * @param force 強制的に削除する場合はtrue
	 * @return 成功した場合はtrue
	 */
	public boolean removePlayer(String player, boolean force);

	/**
	 * このチームの上限人数を設定します
	 *
	 * @param max 設定したい上限人数*/
	public void setMaxPlayer(int max);

	/**
	 * このチームの名前を設定します
	 *
	 * @param name 設定したいチームの名前
	 */
	public void setTeamName(String name);
}
