
public class AsciiChars 
{
  public static void printNumbers()
  {
      for(int i=48; i<= 57; i++)
      {
          System.out.println("The ASCII values for 0-9 are " +i);
      }
  }

  public static void printLowerCase()
  {
      for(int i=97; i< 123; i++)
      {
          System.out.println("The ASCII values for a-z are " +i);
      }
  }

  public static void printUpperCase()
  {
      for(int i=65; i<= 90; i++)
      {
          System.out.println("The ASCII values for A-Z are " +i);
      }
  }
  
  public static void main(String[] args)
  {
      printNumbers();
      printLowerCase();
      printUpperCase();
  }
}