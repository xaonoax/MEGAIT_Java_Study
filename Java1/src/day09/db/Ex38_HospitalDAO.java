package day09.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import utils.MyUtil;

public class Ex38_HospitalDAO {
	Connection conn = null;
	Statement stmt = null;  // SQL 문장, 커넥션을 통해 DB에 보내줌
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Ex38_HospitalDAO() {  // Constructor
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3399/member",
					"root", "1234");
		}
		catch(Exception e) { e.printStackTrace(); }
		
		if(conn != null) {
			System.out.println("Member Database OK");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex38_HospitalDAO dao = new Ex38_HospitalDAO();
		Ex38_HospitalVO vo = dao.getHospitalInfo("분당서울대학교병원");
		System.out.println(vo.getAddr());
		System.out.println(vo);  // .toString를 생략해도 toString 함수를 찾음
	}
	
	public Ex38_HospitalVO getHospitalInfo(String hptl_nm) {
		Ex38_HospitalVO vo = new Ex38_HospitalVO();
		String sql = "select hptl_nm, sido_cd_nm, siggu_cd_nm, addr \n" +
					 "from   hptl_mast \n" +
					 "where  hptl_nm = '" + hptl_nm + "'";
		System.out.println("[getHospitalInfo()]");
		System.out.println(MyUtil.ITALIC + sql + MyUtil.END);
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			// bind 변수를 활용하려면 PreparedStatement를 활용한다.
			// sql을 완벽하게 string으로 만들어서 던지는 쿼리를 literal Query라고 하며
			// 자주 사용할 경우 DBA와 만날 수 있다.
			if(rs.next()) {
				System.out.println("[getHospitalInfo()] There is data!!!");
				vo.setHptlNm(hptl_nm);
				vo.setSidoCdNm(rs.getString("sido_cd_nm"));  // 돌아오는 코드가 숫자면 getInt
				vo.setSigguCdNm(rs.getString("siggu_cd_nm"));
				vo.setAddr(rs.getString("addr"));
			}
			else {
				System.out.println("[getHospitalInfo()] There is no data");
			}
		}
		catch(Exception e) { e.printStackTrace(); }
		
		return vo;
	}

}
