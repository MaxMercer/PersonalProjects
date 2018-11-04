package com.mesdasdt5235.RayneBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * 
 * @author Max Mercer
 *
 */

public class App extends ListenerAdapter


{
    public static void main(String[] args) throws LoginException, InterruptedException
    {
    	JDA builder = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
    	
    String token = "NTA4NjkwODYwMzkzNjI3NjU5.DsC7CA.gqEPHGj5fnVX-9esa-990_FIcC4";
   
    builder.addEventListener(new App());
    
    }

    public void onMessageReceived(MessageReceivedEvent e)
    {
    	//Objects
    	User user = e.getAuthor();
    	MessageChannel chan = e.getChannel();
    	Message msg = e.getMessage();
    	
    	//Commands
    	
    	if(msg.getContentRaw().equalsIgnoreCase(Ref.prefix+"ping"))
    	{
    		//queues the action
    		chan.sendMessage(user.getAsMention() + " Pong!").queue();
    	}
    	
    	if(msg.getContentRaw().equalsIgnoreCase(Ref.prefix+"help"));
    	{
    		chan.sendMessage(user.getAsMention() + " Hello! I am Rayne's butler!"
    				+ " It is a pleasure to serve you and my master! "
    				+ " I am limited in what I can do at the moment, but here is a list"
    				+ " of my commands."
    				+ " * is the prefix for my commands "
    				+ "*ping : checks if I am alive ").queue();
    	}
    	
    		
    		
        System.out.println("Sir, I got a message from: "+
                            e.getAuthor().getName()+ ": "+
                            e.getMessage().getContentDisplay());

       

    }



}
