package cz.arthedain.worldevents.impl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cz.arthedain.worldevents.impl.ai.AiService;
import cz.arthedain.worldevents.impl.commands.ACFBootstrap;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.author.Authors;

@Plugin(name = "WorldEvents", version = "0.0.1")
@Authors({
        @Author("NeumimTo"),
        @Author("Debílek")
})
public class WorldEvents extends JavaPlugin {

    private static WorldEvents INSTANCE;

    @Override
    public void onEnable() {
        WorldEvents.INSTANCE = this;

        Injector injector = Guice.createInjector(binder -> {
            binder.bind(AiService.class);
            binder.bind(ACFBootstrap.class);
        });

        injector.getInstance(ACFBootstrap.class).initialize();
    }

    public static WorldEvents getInstance() {
        return INSTANCE;
    }
}
