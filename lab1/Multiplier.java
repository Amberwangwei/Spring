package lab1;

public class Multiplier implements Calculator {

	@Override
	public int calculator(int input1, int input2) {
		// TODO Auto-generated method stub
		return input1*input2;
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "X";
	}

}
