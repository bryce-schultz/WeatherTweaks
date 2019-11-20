package me.bryceschultz.weathertweaks;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class WeatherTweaks extends JavaPlugin
{

    public static int modifier = 1;

    @Override
    public void onEnable()
    {
        loadConfig();
        this.modifier = this.getConfig().getInt("Weather Modifier");
        this.getServer().getPluginManager().registerEvents(new Events(), this);
    }

    private void loadConfig()
    {
        this.getConfig().options().copyDefaults(true);
        if (!this.getConfig().contains("Weather Modifier"))
        {
            this.getConfig().set("Weather Modifier", 2);
        }
        this.saveConfig();
    }

    @Override
    public void onDisable()
    { }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        MinecraftCommand cmd = new MinecraftCommand(this, command, sender, label, args);

        if (cmd.equalsIgnoreCase("setweathermodifier"))
        {
            return Commands.setWeatherModifierCommand(cmd);
        }
        return false;
    }
}
