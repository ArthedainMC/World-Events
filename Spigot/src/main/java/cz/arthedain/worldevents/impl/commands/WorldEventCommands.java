package cz.arthedain.worldevents.impl.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import cz.arthedain.worldevents.impl.ai.AiService;
import org.bukkit.entity.Player;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@CommandAlias("wec|worldevents")
public class WorldEventCommands extends BaseCommand {

    @Inject
    private AiService aiService;

    @Subcommand("spawn-dummy")
    public void dummy(Player commandSender) {
        //aiService.
    }
}
