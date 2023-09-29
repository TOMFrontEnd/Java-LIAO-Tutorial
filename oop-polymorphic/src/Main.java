
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = { new Income(3000), new SalaryIncome(7500), new RoyaltyIncome(12000) };
//		double total = 0;
//		for (Income income: incomes)
//		{total+=income.getTax();}
// 另外一种写法
		System.out.println(total(incomes));
	}
	
	public static double total(Income...incomes) {
		double total=0;
		for (Income income: incomes) {
			total+=income.getTax();
					}
		return total;
	}

}
// have to use static type for double total as its called from static type method of "main"