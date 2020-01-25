package com.jwolfe.rex.redis.commons;

import redis.clients.jedis.Jedis;

public class RedisClient {
    private Jedis jedis;

    public void connect() {
        jedis = new Jedis("localhost", 6379);
    }

    public void set(String key, String value) {
        if(jedis == null) {
            connect();
        }

        jedis.set(key, value);
    }

    public String get(String key) {
        if(jedis == null) {
            connect();
        }

        return jedis.get(key);
    }
}
