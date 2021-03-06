/*
 * RUNESCAPE PRIVATE SERVER FRAMEWORK
 * 
 * This file is part of the Hyze Server
 *
 * Hyze is a private RuneScape server focused primarily on
 * in the Brazilian community. The project has only 1 developer
 *
 * Objective of the project is to bring the best content, performance ever seen
 * by brazilians players in relation to private RuneScape servers (RSPS).
 */

package com.hyze.events


/**
 * DESCRIPTION
 *
 * @author var_5
 * @date 29/07/2020 at 11:16
 */
abstract class Event{

    private val name: String
    private val isAsync: Boolean

    constructor(name: String, isAsync: Boolean){
        this.name = name
        this.isAsync = isAsync
    }

    constructor(isAsync: Boolean){
        this.name = this::class.java.simpleName
        this.isAsync = isAsync
    }

    constructor(){
        this.name = this::class.java.simpleName
        this.isAsync = false
    }

    fun getEventName(): String{
        return name
    }

}