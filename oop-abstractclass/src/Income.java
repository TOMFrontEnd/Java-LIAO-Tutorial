
/**
 * 定义抽象类Income
 */
public abstract class Income {
  double income;
  public Income(double income) {
	  this.income = income;
  }
	public abstract double getTax();
}
