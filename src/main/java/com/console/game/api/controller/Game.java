package com.console.game.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class Game {

    /**
     * 列表
     * @param lastId
     * @return
     */
    @RequestMapping("/list/{lastId}")
    public List getGameList(@PathVariable(value = "lastId" ) int lastId){
        return null;
    }

    /**
     * 详情
     * @param gameId
     * @return
     */
    @RequestMapping("/detail/{gameId}")
    public Object getGameDetail(@PathVariable(value = "gameId") int gameId){
        return null;
    }


}
