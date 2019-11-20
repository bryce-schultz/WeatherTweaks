package me.bryceschultz.weathertweaks;

import org.bukkit.ChatColor;

public class Commands
{
    public static boolean setWeatherModifierCommand(MinecraftCommand cmd)
    {
        if (cmd.length() != 2)
        {
            try
            {
                WeatherTweaks.modifier = Integer.parseInt(cmd.getSubCommand());
                cmd.getPlugin().getConfig().set("Weather Modifier", WeatherTweaks.modifier);
                cmd.getPlugin().saveConfig();
            }
            catch (Exception e)
            {
                cmd.sendReturnMessage(ChatColor.RED + "Invalid Argument, the value must be a whole number!");
            }

        }
        else
        {
            cmd.sendReturnMessage(ChatColor.RED + "Invalid Usage! /setweathermodifier <value>");
        }
        return true;
    }
}
