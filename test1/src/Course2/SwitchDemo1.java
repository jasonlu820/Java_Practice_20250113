package Course2;

public class SwitchDemo1 {
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String[] args) {
//	ex1:
//		int num = 1;
//		switch (num) {
//		case 1:
//			System.out.printf("一月");
//			break;
//		case 2:
//			System.out.printf("二月");
//			break;
//		default:
//			System.out.print("不是一月或二月");
//		}
//	ex2:
//		int num1 = 1, num2 = 2;
//		switch (num1 + num2) {
//		case 1:
//		case 2:
//		case 3:
//			System.out.printf("兩數相加的值介於1~3");
//			break;
//		default:
//			System.out.print("兩數相加的值不是介於1~3");
//		}
//	ex3:
//		char ch = 'y';
//		switch (ch) {
//		case 'Y':
//		case 'y':
//			System.out.printf("繼續使用！");
//			break;
//		default:
//			System.out.printf("離開系統！");
//		}
//	ex4:
//		String title = "主任";
//		switch (title) {
//		case "董事長":
//			System.out.printf("公司的領導！");
//			break;
//		case "經理":
//			System.out.printf("公司的中堅！");
//			break;
//		default:
//			System.out.print("公司的基礎！");
//		}
//	ex5:
		Day weekDay = Day.THURSDAY;
		switch (weekDay) {
		case SATURDAY:
			System.out.println("周末");
			break;
		default:
			System.out.println("工作日");
		}
	}
}
