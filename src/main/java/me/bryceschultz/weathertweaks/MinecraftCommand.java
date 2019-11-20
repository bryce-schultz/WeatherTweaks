package me.bryceschultz.weathertweaks;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class MinecraftCommand
{
    // local variables to store command information
    // to make commands easier to write
    private Command command;
    private CommandSender sender;
    private String label;
    private String[] args;
    private Plugin plugin;

    // default constructor
    public MinecraftCommand()
    { }

    // four argument constructor
    public MinecraftCommand(Plugin plugin, Command command, CommandSender sender, String label, String[] args)
    {
        this.plugin = plugin;
        this.command = command;
        this.sender = sender;
        this.label = label;
        this.args = args;
    }

    public int length()
    {
        return this.args.length;
    }

    public boolean hasSubCommand()
    {
        return this.args.length > 0;
    }

    public boolean subCommandEquals(String command)
    {
        if (this.args.length < 1)
        {
            return false;
        }
        else
        {
            return this.args[0].equalsIgnoreCase(command);
        }
    }

    public void sendReturnMessage(String message)
    {
        this.sender.sendMessage(message);
    }

    public boolean equals(String command)
    {
        return this.command.getName().equals(command);
    }

    public boolean equalsIgnoreCase(String command)
    {
        return this.command.getName().equalsIgnoreCase(command);
    }

    public String getSubCommand()
    {
        if (this.args.length < 1)
        {
            sendReturnMessage(ChatColor.RED + "No sub command was provided, use \"/party help\" to view list of sub commands.");
            return null;
        }
        else
        {
            return this.args[0];
        }
    }

    public Plugin getPlugin() {
        return this.plugin;
    }

    public Command getCommand()
    {
        return this.command;
    }

    public CommandSender getSender()
    {
        return this.sender;
    }

    public String getLabel()
    {
        return this.label;
    }

    public String[] getArgs()
    {
        return this.args;
    }

    public String getArg(int index)
    {
        return this.args[index];
    }
}
