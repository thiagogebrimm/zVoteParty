package fr.maxlego08.zvoteparty.api;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface VotePartyManager{

	/**
	 * Allows to reload configuration files
	 * 
	 * @param sender - Person who will execute the command
	 */
	void reload(CommandSender sender);
	
	/*
	 * Allows to load the configuration of the plugin
	 */
	void loadConfiguration();

	/**
	 * Allows you to open the voting inventory
	 * 
	 * @param player
	 */
	void openVote(Player player);
	
	/**
	 * Allows you to perform the voting action on a user
	 * 
	 * @param username
	 * @param serviceName
	 */
	void vote(String username, String serviceName);
	
	/**
	 * Allows you to add one to the voteparty
	 */
	void handleVoteParty();

	/**
	 * Add vote to user
	 * 
	 * @param sender
	 * @param player
	 */
	void vote(CommandSender sender, OfflinePlayer player);
	
	/**
	 * Add vote to user
	 * 
	 * @param offlinePlayer
	 * @param serviceName
	 */
	void vote(OfflinePlayer offlinePlayer, String serviceName);
	
	/**
	 * Get reward
	 * 
	 * @return {@link Reward}
	 */
	Reward getRandomReward();

}
