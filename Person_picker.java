public class Person_picker
{
 private int characterAIndex;
 private int characterBIndex;
 
 public void setCharacterIndexs(int numberOfCharacters)
 {
   characterAIndex = (int)Math.random() * (numberOfCharacters + 1);
   characterBIndex = (int)Math.random() * (numberOfCharacters + 1);
 }
}