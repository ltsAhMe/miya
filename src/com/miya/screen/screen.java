package com.miya.screen;

public class screen {
    public String name;
   public pixel[][] screen = new pixel[1280][720];
    public screen(){
       for (int i = 0; i< screen.length; i++){
          for (int b=0;b<screen[i].length;b++){
             screen[i][b] = new pixel();
          }
       }
    }
    public screen(String SetName){
        for (int i = 0; i< screen.length; i++){
            for (int b=0;b<screen[i].length;b++){
                screen[i][b] = new pixel();
            }
        }
        name = SetName;
    }
}
