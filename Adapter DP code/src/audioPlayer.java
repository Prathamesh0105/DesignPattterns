public class audioPlayer implements mediaPlayer {
       
      public void play(String audioType, String fileName){
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: " + fileName);			
      } 
      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
         Adapter mediaAdapter = new Adapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      else{
         System.out.println("Invalid media. " + audioType + " format not supported");
      }

}
}
