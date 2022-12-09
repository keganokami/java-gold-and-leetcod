package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicValue extends Value {
  private AtomicInteger num = new AtomicInteger(0);
  
  public void add(int num) {
    System.out.println("atomic add");
    this.num.addAndGet(num);
  }

  public int get() {
    return this.num.intValue();
  }
}
