package com.sun.pattern.factorysimple;

/**
 * Created by SDL on 2015/5/12.
 */
public class Factory {
    public BMW createBMW(int type){
        switch (type) {

            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }
}
