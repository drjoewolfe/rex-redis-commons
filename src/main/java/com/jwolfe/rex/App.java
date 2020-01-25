package com.jwolfe.rex;

import com.jwolfe.rex.redis.commons.RedisClient;

public class App {
    public static void main(String[] args) {
        RedisClient client = new RedisClient();

        client.set("team1-captain", "lion");
        client.set("team2-captain", "tiger");

        System.out.println(client.get("team1-captain"));
        System.out.println(client.get("team2-captain"));
    }
}
