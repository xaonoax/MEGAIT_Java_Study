package day09.db;

public class Ex38_HospitalVO {
	String hptl_nm;
	String sido_cd_nm;
	String siggu_cd_nm;
	String addr;
	
	public void setHptlNm(String hptl_nm) { this.hptl_nm = hptl_nm;	}
	public void setSidoCdNm(String sido_cd_nm) { this.sido_cd_nm = sido_cd_nm;	}
	public void setSigguCdNm(String siggu_cd_nm) { this.siggu_cd_nm = siggu_cd_nm; }
	public void setAddr(String addr) { this.addr = addr;	}
	
	public String getHptlNm() { return hptl_nm; }
	public String getSidoCdNm() { return sido_cd_nm; }
	public String getSigguCdNm() { return siggu_cd_nm; }
	public String getAddr() { return addr; }
	
	public String toString() {
		String str = "정보가 궁금하십니까?\n" + "병원의 시도는 " + sido_cd_nm +
					 "입니다. 시군구는 " + siggu_cd_nm + "입니다.\n" +
					 "주소는 " + addr + "입니다.";
		return str;
	}
}
