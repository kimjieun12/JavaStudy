public class Exam12_3 {
	public static void main(String[] args) {
		String str = "���ع��� ��λ��� ������ �⵵�� �ϴ����� �����ϻ� �츮���� ����";
		
		int s_idx = 0;
		int e_idx = 0;
		while(true) {
			e_idx = str.indexOf(" ", s_idx + 1);
			
			if(e_idx == -1) {
				System.out.println(str);
				break;
			}
			System.out.println(str.substring(0,e_idx));
			
			s_idx = e_idx;
			
		}

	}
}