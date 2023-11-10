package com.miya.screen;

public class screenMana {
   public screen[] screens = new screen[999];
  public screenMana(){
     screens[0] = new screen("BackRound");
  }


  public int getNull(){
      for (int i=0;i<screens.length;i++){
          if (screens[i] == null){
              return i;
          }
      }
      return -1;
  }
  public void addScreen(screen input){
      screens[getNull()] = input;
  }
  public void deleteScreen(int num){
       for (int i=num;i<getNull();i++){
           screens[i] = screens[i+1];
       }
  }

    public void deleteScreen(String name){
        deleteScreen(findScreenAsName(name));
    }
  public int findScreenAsName(String name){
      for (int i=0;i<screens.length;i++){
          if (screens[i].name.equals(name)){
              return i;
          }
      }
      return -1;
  }

}
