import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정, 5.회원탈퇴까지

		// 스캐너 객체 필요
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 회원관리 시스템 ====");

		while (true) {
			System.out.print("1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정 5.회원탈퇴 6.종료");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==== 로그인 ====");

				System.out.print("ID 입력>> ");
				String id = sc.next();
				System.out.print("PW 입력>> ");
				String pw = sc.next();

				Connection conn = null;
				PreparedStatement psmt = null;
				ResultSet rs = null;

				try {
					// JDBC
					// 0. JDBC를 사용하는 프로젝트에 Driver 파일 넣기
					// 1. Driver 로딩( loading)( 내가 사용 하는 DBMS의 드라이버 로딩)
					// -> 책에서는 드라이버 동적 로딩이라고 함.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Connection 연결
					// connection을 연결하기 위해서는 DB 접속 가능한 url, id, pw 가 필요하다.
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "hr";
					String db_pw = "hr";
					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					// 3.SQL 문 작성 및 실행
					String sql = "select * from bigmember where id= ? and pw = ? ";
					// ? 를 채워주고 실행하는 객체가 있음.
					psmt = conn.prepareStatement(sql);
					// conn이 psmt 에 sql 쓸 수 있는 권한을 넘겨주고 확인함
					psmt.setString(1, id); // 오라클은 인덱스 1번부터
					psmt.setString(2, pw); // 오라클은 인덱스 1번부터

					rs = psmt.executeQuery();
					
					if(rs.next()) {
						System.out.println("로그인 성공" );
//						System.out.println(rs.getString("id"));// 테이블 컬럼 이름
//						System.out.println(rs.getString("pw"));
						System.out.println(rs.getString("nickname")+ "님 환영합니다.");
						
					}else {
						System.out.println("로그인 실패");
					}
					

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
					// 먼저 열은 것을 마지막에 닫아야함.
					try {
						if(rs != null) {  // 로그인 확인에 rs 추가되었음
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
				System.out.println("==== 회원가입 ====");

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
					// 0. JDBC를 사용하는 프로젝트에 Driver 파일 넣기
					// 1. Driver 로딩( loading)( 내가 사용 하는 DBMS의 드라이버 로딩)
					// -> 책에서는 드라이버 동적 로딩이라고 함.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. Connection 연결
					// connection을 연결하기 위해서는 DB 접속 가능한 url, id, pw 가 필요하다.
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					String db_id = "hr";
					String db_pw = "hr";
					conn = DriverManager.getConnection(db_url, db_id, db_pw);

					// 3.SQL 문 작성 및 실행
					String sql = "insert into bigmember values(?, ?, ?)";
					// ? 를 채워주고 실행하는 객체가 있음.
					psmt = conn.prepareStatement(sql);
					// conn이 psmt 에 sql 쓸 수 있는 권한을 넘겨주고 확인함
					psmt.setString(1, id); // 오라클은 인덱스 1번부터
					psmt.setString(2, pw); // 오라클은 인덱스 1번부터
					psmt.setString(3, nick); // 오라클은 인덱스 1번부터

					int cnt = psmt.executeUpdate();

					if (cnt == 0) {
						System.out.println("회원가입 실패! 다시 확인 바랍니다");
					} else {
						System.out.println("회원가입 성공! 로그인으로 이동!");
					}

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally { // 어떤 상황이어도 무조~~건 거쳐가는 구문 페이지
					// 먼저 열은 것을 마지막에 닫아야함.
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
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요.");
			}

		}

	}

}
