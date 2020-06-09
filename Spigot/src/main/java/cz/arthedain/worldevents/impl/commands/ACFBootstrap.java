package cz.arthedain.worldevents.impl.commands;

import co.aikar.commands.PaperCommandManager;
import com.google.inject.Injector;
import cz.arthedain.worldevents.impl.WorldEvents;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ACFBootstrap {

    @Inject
    private Injector injector;

    public void initialize() {
        PaperCommandManager manager = new PaperCommandManager(WorldEvents.getInstance());
        manager.registerCommand(injector.getInstance(WorldEventCommands.class));
    }
}
