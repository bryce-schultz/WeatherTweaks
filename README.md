# WeatherTweaks
WeatherTweaks is a lightweight spigot plugin used
to change weather frequency.

### Download
[WeatherTweaks.jar](https://github.com/bryce-schultz/WeatherTweaks/raw/master/target/WeatherTweaks.jar)

### How to set the modifier
The modifier is easy to use: the number in the config
is the chance that rain will occur. A value of 1 will make
it always rain, 0 will make it never rain, and 2 will make
it rain half of the time it would normally rain. Everytime
the game tries to make a storm or rain the plugin will
have a 1 / <modifier> chance of raining.

### Basic configuration
| Config Value | % Chance    |
|:------------:|:------------:|
|0             |0%            | 
|1             |100%          |
|2             |50%           |
|3             |33.33%        |
|4             |25%           |

### Commands
| Command | Aliases | Permission |
|:-------:|:-------:|:----------:|
|`/setweathermodifier` |`/setwm`, `/swm`|`weathertweaks.setweathermodifier`|
