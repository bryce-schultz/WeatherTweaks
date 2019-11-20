package me.bryceschultz.weathertweaks;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

import java.util.Random;
import java.util.logging.Level;

public class Events implements Listener
{
    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e)
    {
        if(e.toWeatherState())
        {
            if (WeatherTweaks.modifier <= 0)
            {
                Bukkit.getServer().getLogger().log(Level.INFO, "[WeatherTweaks] Canceled attempt to rain");
                e.setCancelled(true);
            }
            else
            {
                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(WeatherTweaks.modifier) + 1;
                if (randomInt != 1)
                {
                    Bukkit.getServer().getLogger().log(Level.INFO, "[WeatherTweaks] Canceled attempt to rain");
                    e.setCancelled(true);
                }
            }
        }
    }
}
