/*Properties:structural design pattern
 * used when we have hierarchies in both interfaces as well as implementations & we want to hide implementation 
 * from client
 * it decouple abstraction from its implementation
 * 
 * Generally, we have remote, which works differently for Sony and Philips TV, but we can have different remote
 * as well, for example oldRemote and newRemote, which have different methods for each TV.
 * 
 * TV and Remote implementation
 */

/*Implementation:-
 * class hierarchy: TV, SonyTV, PhilipsTV
 * Interface hierarchy: Remote, oldRemote, newRemote
 * Client: Client class
 */
abstract class TV {
  Remote remote;
  
  TV(Remote r) {
    this.remote = r;
  }
  
  abstract void on();
  abstract void off();
}

class Sony extends TV {
  Remote remoteType;
  Sony(Remote r) {
    super(r);
    this.remoteType = r;
  }
  
  public void on(){
    System.out.print("Sony TV ON: ");
    remoteType.on();
  }
    
  public void off(){
    System.out.print("Sony TV OFF: ");
    remoteType.off();
  }
}
    
class Philips extends TV {
  Remote remoteType;
  
  Philips(Remote r) {
    super(r);
    this.remoteType = r;
  }
  
  public void on(){
    System.out.print("Philips TV ON: ");
    remoteType.on();
  }
    
  public void off(){
    System.out.print("Philips TV OFF: ");
    remoteType.off();
  }
}

interface Remote {
  public void on();
  public void off();
}

class OldRemote implements Remote {

  @Override
  public void on() {
    System.out.println("ON with Old Remote");
  }

  @Override
  public void off() {
    System.out.println("OFF with old Remote");
  }
  
}

class NewRemote implements Remote {

  @Override
  public void on() {
    System.out.println("ON with New Remote");
  }

  @Override
  public void off() {
    System.out.println("OFF with New Remote");
  }
  
}

public class BridgePatternExample {
  public static void main(String[] args) {
    TV sonyOldRemote = new Sony(new OldRemote());
    sonyOldRemote.on();
    sonyOldRemote.off();
    System.out.println();
    
    TV sonyNewRemote = new Sony(new NewRemote());
    sonyNewRemote.on();
    sonyNewRemote.off();
    System.out.println();
    
    TV philipsOldRemote = new Philips(new OldRemote());
    philipsOldRemote.on();
    philipsOldRemote.off();
    System.out.println();
    
    TV philipsNewRemote = new Philips(new NewRemote());
    philipsNewRemote.on();
    philipsNewRemote.off();
    
  }
}
