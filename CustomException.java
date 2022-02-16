class TooYoungException extends RuntimeException {

  TooYoungException(String s) {
    super(s);
  }
}

class TooOldException extends RuntimeException {

  TooOldException(String s) {
    super(s);
  }
}
class Matrimonial{
  public void marrage(int age){
    if (age > 60) {
      throw new TooYoungException("please wait some more time.... u will get best match");
    } else if (age < 18) {
      throw new TooOldException("u r age already crossed....no chance of getting married");
    } else {
      System.out.println("you will get match details soon by e-mail");
    }
  }
}
public class CustomException {

  public static void main(String[] args) {
    Matrimonial matrimonial = new Matrimonial();
    try {
      matrimonial.marrage(15);
    } catch (TooOldException e) {
      System.out.println("old");
    }catch(TooYoungException e){
      e.printStackTrace();;
    }
  }
}
