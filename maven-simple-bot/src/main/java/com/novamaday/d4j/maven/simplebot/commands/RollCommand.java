package com.novamaday.d4j.maven.simplebot.commands;

import discord4j.core.event.domain.interaction.ChatInputInteractionEvent;
import reactor.core.publisher.Mono;

public class RollCommand implements SlashCommand {
    @Override
    public String getName() {
        return "roll";
    }

    @Override
    public Mono<Void> handle(ChatInputInteractionEvent event) {
        //We reply to the command with "Pong!" and make sure it is ephemeral (only the command user can see it)
    	Integer i = (int) (Math.random()*6+1);
        return event.reply()
            .withContent("You rolled " + i + "!");
    }
}
