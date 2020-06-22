package cz.arthedain.worldevents.impl.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import cz.arthedain.worldevents.impl.ai.AiService;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
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
        //Should we check for the instance of commandSender?
        Location playerLocation = commandSender.getLocation();
        Entity entity = commandSender.getWorld().spawnEntity(playerLocation, EntityType.ZOMBIE);
        aiService.removeAiTasks((LivingEntity) entity); //Cast?
    }
}
