
// Restaurant Ŭ������ �ʵ�� �����ڴ� ������ �ʿ� ����
public class Restaurant extends Store {

	double service;
	double flavor;
	double clean;

	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	@Override
	public double grade() {
		// ���⿡ ����, ��, û��, ���� ������ ����� ����� ����� �ۼ��Ͻÿ�
		// (�Ҽ��� 2�ڸ� �� ������ ���)
		double avg = (price + service + flavor + clean) / 4.0;

		return avg;
	}

	public String getName() {
		return name;
	}

}
