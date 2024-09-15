package org.example


fun main(args:Array<String>){
    var map: MutableMap<String,Int> = mutableMapOf()
    for(i in args){
        if (map.containsKey(i)){
            map[i] = map[i]!! + 1
        }
        else{
            map[i] = 1
        }
    }

}