import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ����������, 5.ȸ��Ż�����

		// ��ĳ�� ��ü �ʿ�
		Scanner sc = new Scanner(System.in);

		System.out.println("==== ȸ������ �ý��� ====");

		while (true) {
			System.out.print("1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.����");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==== �α��� ====");

				System.out.print("ID �Է�>> ");
				String id = sc.next();
				System.out.print("PW �Է�>> ");
				String pw = sc.next();

				Connection conn = null;
				PreparedStatement psmt = null;
				ResultSet rs = null;

				try {
					// JDBC
					// 0. JDBC�� ����ϴ� ������Ʈ�� Driver ���� �ֱ�
					// 1. Driver �ε�( loading)( ���� ��� �ϴ� DBMS�� ����̹� �ε�)
					// -> å������ ����̹� ���� �ε��̶�� ��.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Connection ����
					// connection�� �����ϱ� ���ؼ��� DB ���� ������ url, id, pw �� �ʿ��ϴ�.
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "hr";
					String db_pw = "hr";
					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					// 3.SQL �� �ۼ� �� ����
					String sql = "select * from bigmember where id= ? and pw = ? ";
					// ? �� ä���ְ� �����ϴ� ��ü�� ����.
					psmt = conn.prepareStatement(sql);
					// conn�� psmt �� sql �� �� �ִ� ������ �Ѱ��ְ� Ȯ����
					psmt.setString(1, id); // ����Ŭ�� �ε��� 1������
					psmt.setString(2, pw); // ����Ŭ�� �ε��� 1������

					rs = psmt.executeQuery();
					
					if(rs.next()) {
						System.out.println("�α��� ����" );
//						System.out.println(rs.getString("id"));// ���̺� �÷� �̸�
//						System.out.println(rs.getString("pw"));
						System.out.println(rs.getString("nickname")+ "�� ȯ���մϴ�.");
						
					}else {
						System.out.println("�α��� ����");
					}
					

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally { // � ��Ȳ�̾ ����~~�� ���İ��� ���� ������
					// ���� ���� ���� �������� �ݾƾ���.
					try {
						if(rs != null) {  // �α��� Ȯ�ο� rs �߰��Ǿ���
							rs.close();
						}
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			} else if (choice == 2) {
				System.out.println("==== ȸ������ ====");

				System.out.print("ID : ");
				String id = sc.next();

				System.out.print("PW : ");
				String pw = sc.next();

				System.out.print("NickName: ");
				String nick = sc.next();
				// showview > other > Data Management >new>

				Connection conn = null;
				PreparedStatement psmt = null;

				try {
					// JDBC
					// 0. JDBC�� ����ϴ� ������Ʈ�� Driver ���� �ֱ�
					// 1. Driver �ε�( loading)( ���� ��� �ϴ� DBMS�� ����̹� �ε�)
					// -> å������ ����̹� ���� �ε��̶�� ��.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Connection ����
					// connection�� �����ϱ� ���ؼ��� DB ���� ������ url, id, pw �� �ʿ��ϴ�.
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "hr";
					String db_pw = "hr";
					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					// 3.SQL �� �ۼ� �� ����
					String sql = "insert into bigmember values(?, ?, ?)";
					// ? �� ä���ְ� �����ϴ� ��ü�� ����.
					psmt = conn.prepareStatement(sql);
					// conn�� psmt �� sql �� �� �ִ� ������ �Ѱ��ְ� Ȯ����
					psmt.setString(1, id); // ����Ŭ�� �ε��� 1������
					psmt.setString(2, pw); // ����Ŭ�� �ε��� 1������
					psmt.setString(3, nick); // ����Ŭ�� �ε��� 1������

					int cnt = psmt.executeUpdate();

					if (cnt == 0) {
						System.out.println("ȸ������ ����! �ٽ� Ȯ�� �ٶ��ϴ�");
					} else {
						System.out.println("ȸ������ ����! �α������� �̵�!");
					}

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally { // � ��Ȳ�̾ ����~~�� ���İ��� ���� ������
					// ���� ���� ���� �������� �ݾƾ���.
					try {
						if (psmt != null) {
							psmt.close();
						}
						if (conn != null) {
							conn.close();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {

			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");
			}

		}

	}

}
